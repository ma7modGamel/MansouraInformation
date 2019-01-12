package com.example.xxpc.mansorainfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Medical_List extends AppCompatActivity {
private RecyclerView recyclerViewDoctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_medical__list);
        recyclerViewDoctors=findViewById(R.id.recyclerViewId);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerViewDoctors.setLayoutManager(manager);
        String[] name_dr={getString(R.string.name_Dr1),getString(R.string.name_Dr2),getString(R.string.name_Dr3),getString(R.string.name_Dr4),getString(R.string.name_Dr5),getString(R.string.name_Dr6)};
        String[] location_dr={getString(R.string.oricaSt),getString(R.string.gaishSt),getString(R.string.gishst),getString(R.string.gomSt),getString(R.string.rahmnSt),getString(R.string.gamsa)};
        String[] phone_dr={getString(R.string.phDr1),getString(R.string.phDr),getString(R.string.phDr2),getString(R.string.phDr3),getString(R.string.phDr4),getString(R.string.phDr5)};
        ArrayList<ModelDoctor> modelDoctorArrayList=new ArrayList<>();
        for (int i = 0; i < name_dr.length; i++) {
            modelDoctorArrayList.add(new ModelDoctor(name_dr[i], location_dr[i], phone_dr[i]));
        }
        recyclerViewDoctors.setAdapter(new DoctorAdabter(getApplicationContext(),modelDoctorArrayList));
    }
}
