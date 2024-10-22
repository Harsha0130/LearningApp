package com.example.project_001;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

public class web_dev_screen extends AppCompatActivity {


    TextView detailsText, detailsText2, detailsText3, detailsText4, detailsText5;
    LinearLayout layout, layout2, layout3, layout4, layout5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_dev_screen);

        detailsText = findViewById(R.id.intro_details1);
        layout = findViewById(R.id.layout1);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailsText2 = findViewById(R.id.intro_details2);
        layout2 = findViewById(R.id.layout2);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailsText3 = findViewById(R.id.intro_details3);
        layout3 = findViewById(R.id.layout3);
        layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailsText4 = findViewById(R.id.intro_details4);
        layout4 = findViewById(R.id.layout4);
        layout4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailsText5 = findViewById(R.id.intro_details5);
        layout5 = findViewById(R.id.layout5);
        layout5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    }

    public void expand1 (View view){

        int v = (detailsText.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layout, new AutoTransition());

        detailsText.setVisibility(v);

    }


    public void expand2 (View view){

        int v = (detailsText2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());

        detailsText2.setVisibility(v);

    }


    public void expand3 (View view){

        int v = (detailsText3.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());

        detailsText3.setVisibility(v);

    }


    public void expand4 (View view){

        int v = (detailsText4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());

        detailsText4.setVisibility(v);

    }


    public void expand5 (View view){

        int v = (detailsText5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());

        detailsText5.setVisibility(v);

    }

}
