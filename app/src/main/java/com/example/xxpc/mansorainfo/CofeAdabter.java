package com.example.xxpc.mansorainfo;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class CofeAdabter extends RecyclerView.Adapter<CofeAdabter.Holder> {
    Context context;
    public CofeAdabter(Context context, ArrayList<ModelCofe> modelCofeArrayList) {
        this.context = context;
        this.modelCofeArrayList = modelCofeArrayList;
    }
    ArrayList <ModelCofe> modelCofeArrayList;

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.item_coffee,parent,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        ModelCofe cofe = modelCofeArrayList.get(position);
        holder.buttonCofeName.setText(cofe.getNameCofe());
    }

    @Override
    public int getItemCount() {
        return modelCofeArrayList.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        public static final String VALUE_OF_COFE = "valueOfCofe";
        Button buttonCofeName;
        Intent intent;
        public Holder(final View itemView) {
            super(itemView);
            buttonCofeName=itemView.findViewById(R.id.btn_id_coffee);
            buttonCofeName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int adapterPosition = getAdapterPosition();
                    ModelCofe cofe = modelCofeArrayList.get(adapterPosition);
                    intent=new Intent(view.getContext(),Show_cofe_info.class);
                    intent.putExtra(VALUE_OF_COFE,cofe);
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
