package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class Settings_Temperature extends AppCompatActivity {

    SwitchCompat switchCompat;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings__temperature);

        switchCompat = findViewById(R.id.settings_temperature_switchButton);
        imageView = findViewById(R.id.settings_imageView);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.off));

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat.isChecked()) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.temperature));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.off));
                }
            }
        });
    }
}