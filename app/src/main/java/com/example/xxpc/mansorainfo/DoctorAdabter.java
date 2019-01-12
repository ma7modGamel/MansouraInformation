package com.example.xxpc.mansorainfo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DoctorAdabter extends RecyclerView.Adapter<DoctorAdabter.holder> {
    Context context;
    ArrayList<ModelDoctor> doctorArrayList;

    public DoctorAdabter(Context context, ArrayList<ModelDoctor> doctorArrayList) {
        this.context = context;
        this.doctorArrayList = doctorArrayList;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_card_info_doctor_item, parent, false);
        return new holder(v);
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        ModelDoctor doctor = doctorArrayList.get(position);


        holder.t1.setText(doctor.getNameDoctor());
        holder.t2.setText(doctor.getPhoneDoctor());
        holder.t3.setText(doctor.getLocationDoctor());
    }


    @Override
    public int getItemCount() {
        return doctorArrayList.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView t1, t2, t3;

        LinearLayout layoutp;
        public holder(View itemView) {
            super(itemView);
            layoutp=itemView.findViewById(R.id.linearID);
            t1 = itemView.findViewById(R.id.id_tv_name);
            t2 = itemView.findViewById(R.id.id_tv_phone);
            t3 = itemView.findViewById(R.id.id_tv_location);
        }
    }
}
