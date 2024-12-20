package com.example.project_001;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

import java.util.Calendar;

public class Signup extends AppCompatActivity {

    Button signup;
    RadioGroup radioGroup;
    TextView editTextDOB;
    CountryCodePicker ccp;
    EditText editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.signup_btn);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(Signup.this, "Account created sucessfully!", Toast.LENGTH_SHORT).show();
            }
        });



        // --------------------------------------------------------------------------------------------------
        radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            }
        });

        // --------------------------------------------------------------------------------------------------

        ccp = findViewById(R.id.ccp);
        editTextPhone = findViewById(R.id.editTextPhone);

        // Optional: Set default country
        ccp.setDefaultCountryUsingNameCode("IN"); // Change "IN" to your desired default country code


//    public String getPhoneNumber() {
//        // Combine country code and phone number
//        String phoneNumber = ccp.getSelectedCountryCodeWithPlus() + editTextPhone.getText().toString();
//        return phoneNumber;
//    }


        // --------------------------------------------------------------------------------------------------

        editTextDOB = findViewById(R.id.editTextDOB);
        editTextDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });
    }
    private void showDatePicker() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                Signup.this,
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    // Format the date as needed
                    String dob = selectedDay + "-" + (selectedMonth + 1) + "-" + selectedYear;
                    editTextDOB.setText(dob);
                },
                year, month, day);
        datePickerDialog.show();

        // --------------------------------------------------------------------------------------------------

    }
}