package com.example.spootvoyage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AdminActivity extends AppCompatActivity {
    Button btnLogOut;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        View btnLogOut = findViewById(R.id.btnLogout);
        mAuth = FirebaseAuth.getInstance();

        btnLogOut.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(AdminActivity.this, LoginActivity.class));
        });

    }


    //for back button function
    public void onBackPressed() {
        Intent intent=new Intent(AdminActivity.this, UserActivity.class);
        startActivity(intent);
        finish();
    }



    //upload image
    public void uploadimage(View view){
        Intent intent=new Intent(AdminActivity.this, UploadImageActivity.class);
        startActivity(intent);
    }


    //view image
    public void viewimage(View view){
        Intent intent=new Intent(AdminActivity.this, ViewDistrictActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null) {
            startActivity(new Intent(AdminActivity.this, LoginActivity.class));
        }
    }
    public void District(View view) {
        Intent i = new Intent(getApplicationContext(), ViewDistrictActivity.class);
        startActivity(i);
    }
}