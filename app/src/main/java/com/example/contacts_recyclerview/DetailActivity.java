package com.example.contacts_recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView nameText, phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameText = findViewById(R.id.nameText);
        phoneText = findViewById(R.id.phoneText);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String phone = intent.getStringExtra("phone");

        nameText.setText("Name: " + firstName + " " + lastName);
        phoneText.setText("Phone: " + phone);
    }
}
