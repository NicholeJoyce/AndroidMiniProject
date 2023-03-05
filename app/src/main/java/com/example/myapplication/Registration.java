package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText fn, mn, ln, sch, pn, ca;
    Button viewmyinfo, homereg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fn = findViewById(R.id.fn);
        mn = findViewById(R.id.mn);
        ln = findViewById(R.id.ln);
        sch = findViewById(R.id.sch);
        pn = findViewById(R.id.pn);
        ca = findViewById(R.id.ca);
        viewmyinfo = findViewById(R.id.viewmyinfo);
        homereg = findViewById(R.id.homereg);

        viewmyinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = fn.getText().toString();
                String middlename = mn.getText().toString();
                String lastname = ln.getText().toString();
                String school = sch.getText().toString();
                String phone = pn.getText().toString();
                String add = ca.getText().toString();

              Intent view = new Intent(Registration.this, displayinfoActivity.class);

              view.putExtra("keyfn", firstname);
              view.putExtra("keymn", middlename);
              view.putExtra("keyln", lastname);
              view.putExtra("keysch", school);
              view.putExtra("keypn", phone);
              view.putExtra("keyca", add);

              startActivity(view);


            }
        });

        homereg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}