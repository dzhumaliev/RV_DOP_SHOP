package com.io.myrecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList<ShopModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);


        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);


        list = new ArrayList<>();
        list.add(0, new ShopModel("Платья", "Size: XXL", "$ 50", R.drawable.a));
        list.add(1, new ShopModel("Платья", "Size: XXL", "$ 50", R.drawable.a));
        list.add(2, new ShopModel("Костюмы", "Size: XL", "$ 500", R.drawable.b));
        list.add(3, new ShopModel("Костюмы", "Size: XL", "$ 500", R.drawable.b));
        list.add(4, new ShopModel("Шапки", "Size: L", "$ 150", R.drawable.c));
        list.add(5, new ShopModel("Шапки", "Size: L", "$ 150", R.drawable.c));
        list.add(6, new ShopModel("Носки", "Size: S", "$ 80", R.drawable.d));
        list.add(7, new ShopModel("Куртки", "Size: XS", "$ 10", R.drawable.b));
        list.add(8, new ShopModel("Куртки", "Size: XS", "$ 10", R.drawable.b));
        list.add(9, new ShopModel("Куртки", "Size: XS", "$ 10", R.drawable.b));


        adapter.addText(list);
    }


}