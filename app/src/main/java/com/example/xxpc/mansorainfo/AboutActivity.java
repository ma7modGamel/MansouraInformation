package com.example.xxpc.mansorainfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    TextView tv_AboutInformation,txtLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        tv_AboutInformation=findViewById(R.id.aboutId);
        tv_AboutInformation.setText(getString(R.string.aboutInfo) +"");
        txtLink= findViewById(R.id.txtLink);
        txtLink.setMovementMethod(LinkMovementMethod.getInstance());
        txtLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(getString(R.string.Link5)));
                startActivity(browserIntent);
            }
        });
    }
}
