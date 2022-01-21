package com.example.a21_jan_2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup radioGroup;
    private TextView themeTV;
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initializing all our variables.
        initView();
        initializingClickOpertion();
    }

    private void initializingClickOpertion() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    private void initView() {
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);

        radioGroup = findViewById(R.id.idRGgroup);
        themeTV = findViewById(R.id.idtvTheme);

        // on below line we are setting on check change method for our radio group.
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on radio button check change
                switch (checkedId) {
                    case R.id.idRBLight:
                        // on below line we are checking the radio button with id.
                        // on below line we are setting the text to text view as light mode.
                        themeTV.setText("Light Theme");
                        // on below line we are changing the theme to light mode.
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                        break;
                    case R.id.idRBDark:
                        // this method is called when dark radio button is selected
                        // on below line we are setting dark theme text to our text view.
                        themeTV.setText("Dark Theme");
                        // on below line we are changing the theme to dark mode.
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                Intent a = new Intent(this,HomeActivity.class);
                startActivity(a);
                break;

            case R.id.button_2:
                Intent b = new Intent(this,AboutActivity.class);
                startActivity(b);
                break;

            case R.id.button_3:
                break;
        }
    }
}