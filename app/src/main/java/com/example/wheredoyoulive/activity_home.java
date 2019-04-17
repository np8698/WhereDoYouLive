package com.example.wheredoyoulive;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class activity_home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout dlDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dlDrawerLayout = findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(this, dlDrawerLayout, R.string.open, R.string.close);
        dlDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if(id == R.id.home){
            Intent intent = new Intent(this, activity_home.class);
            startActivity(intent);
        }
        if(id == R.id.search){
            Intent intent = new Intent(this, activity_search.class);
            startActivity(intent);
        }
        if(id == R.id.login){
            Intent intent = new Intent(this, activity_login.class);
            startActivity(intent);
        }
            return false;
    }


}
