package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvThing;
    private ElectricThingAdapter electricThingAdapter;
    private ArrayList<ElectricThing> electricThings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvThing = findViewById(R.id.rcvThing);
        electricThings = new ArrayList<>();
        electricThings.add(new ElectricThing("Cáp chuyển từ cổng USB sang PS2",R.drawable.dauchuyendoi_1,"39000","50%"));
        electricThings.add(new ElectricThing("Cáp chuyển từ cổng USB sang PS2",R.drawable.carbusbtops2_1,"39000","50%"));
        electricThings.add(new ElectricThing("Cáp chuyển từ cổng USB sang PS2",R.drawable.daucam_1,"39000","50%"));
        electricThings.add(new ElectricThing("Cáp chuyển từ cổng USB sang PS2",R.drawable.dauchuyendoipsps2_1,"39000","50%"));
        electricThings.add(new ElectricThing("Cáp chuyển từ cổng USB sang PS2",R.drawable.daynguon_1,"39000","50%"));
        electricThings.add(new ElectricThing("Cáp chuyển từ cổng USB sang PS2",R.drawable.giacchuyen_1,"39000","50%"));

        electricThingAdapter = new ElectricThingAdapter(this,electricThings);
        rcvThing.setAdapter(electricThingAdapter);

        GridLayoutManager gridLayout = new GridLayoutManager(this,2);
        rcvThing.setLayoutManager(gridLayout);


    }
}