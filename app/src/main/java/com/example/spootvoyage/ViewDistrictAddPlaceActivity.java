package com.example.spootvoyage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewDistrictAddPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_district_add_place);
    }

    public void dist(View view) {
        Intent add = new Intent(getApplicationContext(), AddPlaceActivity.class);
        startActivity(add);
    }
}