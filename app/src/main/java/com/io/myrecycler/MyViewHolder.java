package com.io.myrecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView size;
    TextView price;
    ImageView img;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.tv_title);
        size = itemView.findViewById(R.id.tv_size);
        price = itemView.findViewById(R.id.tv_price);
        img = itemView.findViewById(R.id.image_shop);


    }

    public void onBind(ShopModel data) {

        title.setText(data.title);
        size.setText(data.size);
        price.setText(data.price);

        img.setImageResource(data.image);

    }

}
