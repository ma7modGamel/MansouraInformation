package com.example.xxpc.mansorainfo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class ArrayPhotoAdabter extends RecyclerView.Adapter<ArrayPhotoAdabter.holder> {
    ArrayList<ModelArrayPhoto> modelArrayPhotoArrayList;
    Context context;

    public ArrayPhotoAdabter(ArrayList<ModelArrayPhoto> modelArrayPhotoArrayList, Context context) {
        this.modelArrayPhotoArrayList = modelArrayPhotoArrayList;
        this.context = context;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_array_photo, parent, false);
        return new holder(v);
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        ModelArrayPhoto photo = modelArrayPhotoArrayList.get(position);
        holder.imageView.setImageResource(photo.photo1);

    }

    @Override
    public int getItemCount() {
        return modelArrayPhotoArrayList.size();
    }

    class holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgArray);
        }
    }
}
