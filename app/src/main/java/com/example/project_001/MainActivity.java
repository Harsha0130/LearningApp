package com.example.project_001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    Button login_btn, signup_btn;

    CountryCodePicker ccp;
    EditText editTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_btn = findViewById(R.id.main_signup_btn);
        signup_btn = findViewById(R.id.signup_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });

        // --------------------------------------------------------------------------------------------------

        ccp = findViewById(R.id.ccp);
        editTextPhone = findViewById(R.id.editTextName);

        // Optional: Set default country
        ccp.setDefaultCountryUsingNameCode("IN"); // Change "IN" to your desired default country code


//    public String getPhoneNumber() {
//        // Combine country code and phone number
//        String phoneNumber = ccp.getSelectedCountryCodeWithPlus() + editTextPhone.getText().toString();
//        return phoneNumber;
//    }


        // --------------------------------------------------------------------------------------------------


    }
}