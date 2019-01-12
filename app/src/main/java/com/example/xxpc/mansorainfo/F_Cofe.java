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


/**
 * A simple {@link Fragment} subclass.
 */
public class F_Cofe extends Fragment {


    RecyclerView recyclerViewCofe;

    public F_Cofe() {

        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_f__coffee, container, false);
        recyclerViewCofe = rootView.findViewById(R.id.recycleCoffeeId);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerViewCofe.setLayoutManager(LayoutManager);
        String[] nameCofe = {getString(R.string.ori1), getString(R.string.becaf), getString(R.string.bobMar), getString(R.string.lounge), getString(R.string.cina)};
        String[] linkCofee = {getString(R.string.linkCofe1), getString(R.string.linkCofe2), getString(R.string.linkCofe5), getString(R.string.linkCofe4), getString(R.string.linkCofe3)};
        int[] photo1 = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5};
        int[] photo2 = {R.drawable.pp1, R.drawable.pp2, R.drawable.pp3, R.drawable.pp4, R.drawable.pp5};
        int[] photo3 = {R.drawable.ppp1, R.drawable.ppp2, R.drawable.ppp3, R.drawable.ppp5, R.drawable.ppp5};
        String[] locationCofe = {getString(R.string.mansSt), getString(R.string.damAbdSt), getString(R.string.gaishStter), getString(R.string.amsd), getString(R.string.manRst)};
        String[] phoneCofe = {getString(R.string.phoneCofe2), getString(R.string.phoneCofe1), getString(R.string.phoneCofe), getString(R.string.phoneCofe4), getString(R.string.phoneCofe5)};
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
                browserIntent.setData(Uri.parse(getString(R.string.linlWiki)));
                startActivity(browserIntent);
            }
        });
        return rootView;
    }

}
