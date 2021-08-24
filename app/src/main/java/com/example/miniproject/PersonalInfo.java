package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalInfo extends AppCompatActivity {
    Button buttonGotoSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        buttonGotoSkills = findViewById(R.id.gotoskillsandhobbies);

        buttonGotoSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), HobbiesSkills.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in,R.anim.left_slide_out);
            }
        });
    }
}