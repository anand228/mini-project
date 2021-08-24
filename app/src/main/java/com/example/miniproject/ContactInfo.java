package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactInfo extends AppCompatActivity {



    TextView gmail;
    TextView github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        gmail = findViewById(R.id.gmail);
        github = findViewById(R.id.github);
        gmail.setMovementMethod(LinkMovementMethod.getInstance());
        github.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}