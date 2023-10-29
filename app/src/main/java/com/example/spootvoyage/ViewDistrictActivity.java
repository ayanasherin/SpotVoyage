package com.example.spootvoyage;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ViewDistrictActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_district);


    }
    public void district(View view) {
        int cardId = view.getId();
        String cardName = getResources().getResourceEntryName(cardId); // Get the resource entry name (e.g., "Kollam")

        if (cardName.equals("Thiruvananthapuram")) {
            String data = "Thiruvananthapuram";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }


        if (cardName.equals("Kollam")) {
            String data = "Kollam";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Pathanamthitta")) {
            String data = "Pathanamthitta";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Alappuzha")) {
            String data = "Alappuzha";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }


        if (cardName.equals("Kottayam")) {
            String data = "Kottayam";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Idukki")) {
            String data = "Idukki";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }




        if (cardName.equals("Ernakulam")) {
            String data = "Ernakulam";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Thrissur")) {
            String data = "Thrissur";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Palakkad")) {
            String data = "Palakkad";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }


        if (cardName.equals("Malappuram")) {
            String data = "Malappuram";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Kozhikode")) {
            String data = "Kozhikode";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }


        if (cardName.equals("Wayanad")) {
            String data = "Wayanad";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

        if (cardName.equals("Kannur")) {
            String data = "Kannur";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }


        if (cardName.equals("Kasaragod")) {
            String data = "kasaragod";
            Intent intent =new Intent(ViewDistrictActivity.this, ViewImageActivity.class);
            intent.putExtra("key", data);
            startActivity(intent);
        }

    }
}