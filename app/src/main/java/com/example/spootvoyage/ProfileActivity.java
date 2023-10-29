package com.example.spootvoyage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class ProfileActivity extends AppCompatActivity {

    EditText etuserName,etbio,etemail;
    AppCompatButton btnInsertData;
    DatabaseReference userDbRef;
    String currentUId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        etuserName = findViewById(R.id.editTextUsername);
        etbio = findViewById(R.id.editTextbio);
        etemail = findViewById(R.id.editTextEmail);
        btnInsertData = findViewById(R.id.setprofile);


     currentUId = FirebaseAuth.getInstance().getCurrentUser().getUid();

       userDbRef = FirebaseDatabase.getInstance().getReference("Users");
        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertUserData(currentUId);
                Intent intent =new Intent(ProfileActivity.this, ProfileDisplayActivity.class);
                startActivity(intent);
            }
        });
    }

    private void insertUserData(String currentUId){
        String name = etuserName.getText().toString();
        String email = etemail.getText().toString();
        String bio = etbio.getText().toString();

        String id = currentUId;

        Users user = new Users(id,name,email,bio);
        assert id != null;
        userDbRef.child(id).setValue(user);
        Toast.makeText(ProfileActivity.this,"Data inserted!",Toast.LENGTH_SHORT).show();
    }
}