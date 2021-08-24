package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HobbiesSkills extends AppCompatActivity {

    Button buttonGotoContactInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies_skills);

        buttonGotoContactInfo = findViewById(R.id.gotocontact);
        buttonGotoContactInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContactInfo.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in,R.anim.left_slide_out);
            }
        });
    }
}