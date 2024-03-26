package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String nim = intent.getStringExtra("nim");
        int imageResourceId = intent.getIntExtra("image",0);

        ImageView imageView = findViewById(R.id.desc_img);
        TextView nameTextView = findViewById(R.id.desc_nama);
        TextView nimTextView = findViewById(R.id.desc_nim);

        imageView.setImageResource(imageResourceId);
        nameTextView.setText(name);
        nimTextView.setText(nim);
    }
}