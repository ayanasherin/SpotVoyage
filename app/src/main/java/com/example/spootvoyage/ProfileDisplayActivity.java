package com.example.spootvoyage;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileDisplayActivity extends AppCompatActivity {
    TextView emailTextView, usernameTextView, bioTextView;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_display);

        emailTextView = findViewById(R.id.editTextEmail);
        usernameTextView = findViewById(R.id.editTextUsername);
        bioTextView = findViewById(R.id.editTextbio);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {
            // Retrieve the current user's UID
            String currentUid = user.getUid();

            // Initialize the database reference to the location where email and password are stored
            databaseReference = FirebaseDatabase.getInstance().getReference("Users").child(currentUid);

            // Add a ValueEventListener to read the data
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        // Get the email and password from the database
                        String email = dataSnapshot.child("email").getValue(String.class);
                        String username = dataSnapshot.child("userName").getValue(String.class);
                        String bio = dataSnapshot.child("bio").getValue(String.class);


                        // Set the email and password to the TextViews
                        usernameTextView.setText(username);
                        emailTextView.setText(email);
                        bioTextView.setText(bio);

                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    // Handle any errors that may occur during the data retrieval
                }
            });
        }

    }



    //for back button function
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(ProfileDisplayActivity.this, UserActivity.class);
        startActivity(intent);
    }



    public void Editprofile(View view){
        Intent intent=new Intent(ProfileDisplayActivity.this, ProfileActivity.class);
        startActivity(intent);
    }



}