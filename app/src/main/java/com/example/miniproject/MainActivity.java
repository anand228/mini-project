package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonGotoPersonalInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGotoPersonalInfo = findViewById(R.id.gotopersonalinfo);

        buttonGotoPersonalInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), PersonalInfo.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_slide_in,R.anim.left_slide_out);
            }
        });
    }
}