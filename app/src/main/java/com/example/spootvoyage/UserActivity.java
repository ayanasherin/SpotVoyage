package com.example.spootvoyage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserActivity extends AppCompatActivity {
    Button btnLogOut;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        btnLogOut = findViewById(R.id.btnLogout);
        mAuth = FirebaseAuth.getInstance();

        btnLogOut.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(UserActivity.this, LoginActivity.class));
        });

    }


    public void profilepage(View view){
        Intent intent=new Intent(UserActivity.this, ProfileDisplayActivity.class);
        startActivity(intent);
        finish();
    }


    public void exploredistrict(View view){
        Intent intent=new Intent(UserActivity.this, ViewDistrictActivity.class);
        startActivity(intent);
        finish();
    }



    //view district list
    public void viewdistrictlist(View view){
        Intent intent=new Intent(UserActivity.this, ViewDistrictActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null) {
            startActivity(new Intent(UserActivity.this, LoginActivity.class));
        }
    }
}