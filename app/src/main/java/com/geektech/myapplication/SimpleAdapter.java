package com.geektech.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    private ArrayList<Person> data;

    public SimpleAdapter(ArrayList<Person> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SimpleViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_for_recyclerview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {
        holder.onBind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
