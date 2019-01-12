package com.example.xxpc.mansorainfo;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class F_Restrunt extends Fragment {


    public F_Restrunt() {
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        RecyclerView recyclerViewCofe;
        View rootView =  inflater.inflate(R.layout.fragment_f__restrunt, container, false);
        recyclerViewCofe = rootView.findViewById(R.id.recycleCoffeeId);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerViewCofe.setLayoutManager(LayoutManager);
        String[] nameCofe = {getString(R.string.orica), getString(R.string.BicMans), getString(R.string.marly), getString(R.string.Longe), getString(R.string.cibonMans)};
        String[] linkCofee = {getString(R.string.linkF1), getString(R.string.linkF2), getString(R.string.linkF3), getString(R.string.linkF4), getString(R.string.linkF)};
        int[] photo1 = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5};
        int[] photo2 = {R.drawable.pp1, R.drawable.pp2, R.drawable.pp3, R.drawable.pp4, R.drawable.pp5};
        int[] photo3 = {R.drawable.ppp1, R.drawable.ppp2, R.drawable.ppp3, R.drawable.ppp5, R.drawable.ppp5};
        String[] locationCofe = {getString(R.string.gomst), getString(R.string.abdr7mn), getString(R.string.geish), getString(R.string.mansGom), getString(R.string.newDam)};
        String[] phoneCofe = {getString(R.string.ph1), getString(R.string.ph2), getString(R.string.ph3), getString(R.string.ph4), getString(R.string.ph5)};
        ArrayList<ModelCofe> modelCofeArrayList = new ArrayList<>();
        for (int i = 0; i < nameCofe.length; i++) {
            modelCofeArrayList.add(new ModelCofe(nameCofe[i], phoneCofe[i], linkCofee[i], photo1[i], photo2[i], photo3[i], locationCofe[i]));
        }
        recyclerViewCofe.setAdapter(new CofeAdabter(getContext(), modelCofeArrayList));
        TextView txtGoTomaps = rootView.findViewById(R.id.txtmaps);
        txtGoTomaps.setMovementMethod(LinkMovementMethod.getInstance());
        txtGoTomaps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(getString(R.string.link3)));
                startActivity(browserIntent);
            }
        });
        return rootView ;
    }
}
