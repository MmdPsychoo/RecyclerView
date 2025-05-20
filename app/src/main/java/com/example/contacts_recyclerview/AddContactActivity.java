package com.example.contacts_recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddContactActivity extends AppCompatActivity {

    EditText firstNameInput, lastNameInput, phoneInput;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        firstNameInput = findViewById(R.id.firstNameInput);
        lastNameInput = findViewById(R.id.lastNameInput);
        phoneInput = findViewById(R.id.phoneInput);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(v -> {
            String firstName = firstNameInput.getText().toString();
            String lastName = lastNameInput.getText().toString();
            String phone = phoneInput.getText().toString();

            if (!firstName.isEmpty() && !lastName.isEmpty() && !phone.isEmpty()) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("firstName", firstName);
                resultIntent.putExtra("lastName", lastName);
                resultIntent.putExtra("phone", phone);
                setResult(RESULT_OK, resultIntent);
                finish();
            } else {
                Toast.makeText(this, "لطفا تمام فیلدها را پر کنید", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
