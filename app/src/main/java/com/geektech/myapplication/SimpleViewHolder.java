package com.geektech.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView tvName, tvNumber;

    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.iv_item);
        tvName = itemView.findViewById(R.id.tv_name);
        tvNumber = itemView.findViewById(R.id.tv_number);

    }

    public void onBind(Person person) {

        imageView.setImageResource(person.getImage());
        tvName.setText(person.getName());
        tvNumber.setText(String.valueOf(person.getNumber()));
    }
}
