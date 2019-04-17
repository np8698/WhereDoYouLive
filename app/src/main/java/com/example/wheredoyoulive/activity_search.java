package com.example.wheredoyoulive;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toolbar;

/*interface helper extends OnItemSelectedListener{

    private Spinner spArea;

    public void addListenerOnSpinnerItemSelection() {
        spArea = (Spinner) findViewById(R.id.area);
        spArea.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
}*/

public class activity_search extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Spinner spArea;
    private Spinner spPropertyStatus;
    private Spinner spLocation;
    private Spinner spPropertyTypes;
    private Spinner spBedrooms;
    private Spinner spBathrooms;
    private Spinner spMaxPrice;
    private Button btnSearch;

    private DrawerLayout dlDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        dlDrawerLayout = findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(this, dlDrawerLayout, R.string.open, R.string.close);
        dlDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        addItemsOnPropertyStatus();
        addItemsOnLocation();
        addItemsOnPropertyTypes();
        addItemsOnBedrooms();
        addItemsOnBathrooms();
        addItemsOnMaxPrice();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();

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

    public void addItemsOnPropertyStatus(){

        spPropertyStatus = findViewById(R.id.property_status);
        List<String> list = new ArrayList<String>();
        list.add("For Sale");
        list.add("For Rent");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,  list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spArea.setAdapter(dataAdapter);

    }

    public void addItemsOnLocation(){

        spLocation = findViewById(R.id.location);
        List<String> list = new ArrayList<String>();
        list.add("United Kingdom");
        list.add("American Samoa");
        list.add("Belgium");
        list.add("Canada");
        list.add("Delaware");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,  list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spArea.setAdapter(dataAdapter);

    }

    public void addItemsOnPropertyTypes(){

        spPropertyTypes = findViewById(R.id.property_types);
        List<String> list = new ArrayList<String>();
        list.add("Residential");
        list.add("Commercial");
        list.add("Land");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,  list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spArea.setAdapter(dataAdapter);

    }

    public void addItemsOnBedrooms(){

        spBedrooms = findViewById(R.id.bedrooms);
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,  list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spArea.setAdapter(dataAdapter);

    }

    public void addItemsOnBathrooms(){

        spBathrooms = findViewById(R.id.bathrooms);
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,  list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spArea.setAdapter(dataAdapter);

    }

    public void addItemsOnMaxPrice(){

        spMaxPrice = findViewById(R.id.max_price);
        List<String> list = new ArrayList<String>();
        list.add("150000");
        list.add("100000");
        list.add("50000");
        list.add("10000");
        list.add("5000");
        list.add("1000");
        list.add("500");
        list.add("100");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,  list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spArea.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spArea = (Spinner) findViewById(R.id.area);
        spArea.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnButton() {

        spArea = (Spinner) findViewById(R.id.area);
        spPropertyStatus = (Spinner) findViewById(R.id.property_status);
        spLocation = (Spinner) findViewById(R.id.location);
        spPropertyTypes = (Spinner) findViewById(R.id.property_types);
        spBedrooms = (Spinner) findViewById(R.id.bedrooms);
        spBathrooms = (Spinner) findViewById(R.id.bathrooms);
        spMaxPrice = (Spinner) findViewById(R.id.max_price);
        btnSearch = (Button) findViewById(R.id.bSearch);

        btnSearch.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(activity_search.this,
                        "Searching ...." ,Toast.LENGTH_SHORT).show();
            }

        });
    }

}
