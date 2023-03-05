package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class displayinfoActivity extends AppCompatActivity {
    EditText fn, mn, ln, sch, pn, ca;
    Button  backreg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayinfo);


        fn = findViewById(R.id.fn);
        mn = findViewById(R.id.mn);
        ln = findViewById(R.id.ln);
        sch = findViewById(R.id.sch);
        pn = findViewById(R.id.pn);
        ca = findViewById(R.id.ca);
        backreg = findViewById(R.id.backreg);


        String first = getIntent().getStringExtra("keyfn");
        String middle = getIntent().getStringExtra("keymn");
        String last = getIntent().getStringExtra("keyln");
        String school = getIntent().getStringExtra("keysch");
        String phone = getIntent().getStringExtra("keypn");
        String add = getIntent().getStringExtra("keyca");

        Intent i = new Intent(displayinfoActivity.this, Registration.class);
        fn.setText(first);
        mn.setText(middle);
        ln.setText(last);
        sch.setText(school);
        pn.setText(phone);
        ca.setText(add);

        backreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }



}