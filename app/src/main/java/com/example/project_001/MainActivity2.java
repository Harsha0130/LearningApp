package com.example.project_001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    ImageButton app_dev, web_dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        app_dev = findViewById(R.id.app_btn);
        web_dev = findViewById(R.id.web_btn);

        app_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
////                Uri app_webpage = Uri.parse("https://www.w3schools.com/java/default.asp");
//                Intent intent = new Intent(Intent.ACTION_VIEW, app_webpage);
                Intent intent = new Intent(MainActivity2.this, app_dev_screen.class);
                startActivity(intent);
            }
        });

        web_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Uri app_webpage = Uri.parse("*");
                Intent intent = new Intent(MainActivity2.this, web_dev_screen.class);
                startActivity(intent);
            }
        });
    }
}