package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Abmi Sukma Edri","12250120341",R.drawable.abmi));
        items.add(new Item("Ahmad Kurniawan","12250111514",R.drawable.ahmad));
        items.add(new Item("Aufa Hajati","12250111603",R.drawable.aufa));
        items.add(new Item("Daffa Finanda","12250120338",R.drawable.dapin));
        items.add(new Item("Daffa Ikhwan Nurfauzan","12250110979",R.drawable.dapa));
        items.add(new Item("Dwi Jelita Adhliyah","12250120331",R.drawable.jelita));
        items.add(new Item("Dwi Mahdini","12250111298",R.drawable.dwi));
        items.add(new Item("Fajri","12250110382",R.drawable.fajri));
        items.add(new Item("Fakhri","12250111381",R.drawable.fakhri));
        items.add(new Item("Farras Lathief","12250111328",R.drawable.farras));
        items.add(new Item("Gilang Ramadhan Indra","12250111323",R.drawable.gilang));
        items.add(new Item("Hafidz Alhadid Rahman","12250111794",R.drawable.hafidz));
        items.add(new Item("Haritsah Naufaldy","12250110361",R.drawable.aldy));
        items.add(new Item("M. Nabil Dawami","12250111527",R.drawable.nabil));
        items.add(new Item("Muh. Zaki Erbai Syas","12250111134",R.drawable.zaki));
        items.add(new Item("Muhammad Aditya Rinaldi","12250111048",R.drawable.aditya));
        items.add(new Item("Muhammad Dhimas Hadid","12250111231",R.drawable.dms));
        items.add(new Item("Muhammad Faruq","12250111791",R.drawable.faruqhz));
        items.add(new Item("Muhammad Rafly Wirayudha","12250111489",R.drawable.rafly));
        items.add(new Item("Nurika Dwi Wahyuni","12250120360",R.drawable.nurika));
        items.add(new Item("Ogya Secio Noegroho S","12250111346",R.drawable.ogi));
        items.add(new Item("Rahma Laksita","12250124357",R.drawable.rahma));
        items.add(new Item("Surya Hidayatullah Firdaus","12250111759",R.drawable.surya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}