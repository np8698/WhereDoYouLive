package com.example.wheredoyoulive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import com.squareup.picasso.Picasso;

public class activity_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView ivLogo = findViewById(R.id.ivLogo);
        Picasso.get().load(R.drawable.ic_logo).centerInside().into(ivLogo);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, activity_search.class);
        startActivity(intent);
    }
}
