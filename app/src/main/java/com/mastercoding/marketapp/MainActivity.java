package com.mastercoding.marketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.mastercoding.marketapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private ActivityMainBinding viewBinding;
    // Data source
    List<ItemModel> itemList;
    // Adapter
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        itemList = new ArrayList<>();
        ItemModel item1 = new ItemModel(R.drawable.fruit, "Fruits", "Fresh fruits from the garden");
        ItemModel item2 = new ItemModel(R.drawable.vegetables, "Vegetables", "Fresh vegetables from the garden");
        ItemModel item3 = new ItemModel(R.drawable.bread, "Bakery", "Bread and Beans");
        ItemModel item4 = new ItemModel(R.drawable.beverage, "Beverages", "Juice and Drinks");
        ItemModel item5 = new ItemModel(R.drawable.milk, "Milk", "Milk and Eggs");
        ItemModel item6 = new ItemModel(R.drawable.popcorn, "Snacks", "Pop corn, Donut, Drinks");
        ItemModel item7 = new ItemModel(R.drawable.fruit, "Fruits", "Fresh fruits from the garden");
        ItemModel item8 = new ItemModel(R.drawable.vegetables, "Vegetables", "Fresh vegetables from the garden");
        ItemModel item9 = new ItemModel(R.drawable.bread, "Bakery", "Bread and Beans");
        ItemModel item10 = new ItemModel(R.drawable.beverage, "Beverages", "Juice and Drinks");
        ItemModel item11 = new ItemModel(R.drawable.milk, "Milk", "Milk and Eggs");
        ItemModel item12 = new ItemModel(R.drawable.popcorn, "Snacks", "Pop corn, Donut, Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);
        itemList.add(item11);
        itemList.add(item12);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        viewBinding.recyclerView.setLayoutManager(layoutManager);

        itemAdapter = new ItemAdapter(itemList);
        viewBinding.recyclerView.setAdapter(itemAdapter);

        itemAdapter.setItemClickListener(this);


    }

    @Override
    public void onClick(View view, int position) {
        // Handle click events here
        ItemModel clickedItem = itemList.get(position);
        // Example: Show a toast message
        Toast.makeText(this, "Clicked: " + clickedItem.getItemTitle(), Toast.LENGTH_SHORT).show();
    }
}