package com.example.xxpc.mansorainfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Show_cofe_info extends AppCompatActivity {

    public final String VALUE_OF_COFE = getString(R.string.valueOfCofe2);
    TextView textViewNameCofe;
    TextView textViewPhoneCofe;
    TextView textViewLinkCofe;
    TextView textViewLocationCofe;
    RecyclerView recyclerViewPhotoArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cofe_info);
        recyclerViewPhotoArray = findViewById(R.id.recycleViewArrayPhotoid);
        textViewNameCofe = findViewById(R.id.tv_name_cofe);
        textViewLinkCofe = findViewById(R.id.tv_link_cofe);
        textViewLocationCofe = findViewById(R.id.tv_location_cofe);
        textViewPhoneCofe = findViewById(R.id.tv_phone_cofe);
        ModelCofe cofe = getIntent().getParcelableExtra(VALUE_OF_COFE);
        int p1 = cofe.getP1();
        int p2 = cofe.getP2();
        int p3 = cofe.getP3();
        ArrayList<ModelArrayPhoto> arrayPhotos = new ArrayList<>();
        arrayPhotos.add(new ModelArrayPhoto(p1));
        arrayPhotos.add(new ModelArrayPhoto(p2));
        arrayPhotos.add(new ModelArrayPhoto(p3));
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPhotoArray.setLayoutManager(manager);
        textViewNameCofe.setText(cofe.getNameCofe());
        textViewPhoneCofe.setText(cofe.getPhoneCofe());
        textViewLocationCofe.setText(cofe.getLocationcofe());
        final String linkCofe = cofe.getLinkCofe();
        textViewLinkCofe = findViewById(R.id.tv_link_cofe);
        textViewLinkCofe.setMovementMethod(LinkMovementMethod.getInstance());
        textViewLinkCofe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(linkCofe));
                startActivity(browserIntent);
            }
        });
        recyclerViewPhotoArray.setAdapter(new ArrayPhotoAdabter(arrayPhotos, this));

    }
}
