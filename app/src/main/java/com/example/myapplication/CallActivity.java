package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {
    EditText txtnum;
    Button btndial, homedial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        txtnum=findViewById(R.id.txtnum);
        btndial=findViewById(R.id.btndial);
        homedial=findViewById(R.id.homedial);

        btndial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone = txtnum.getText().toString();
                Intent dial = new Intent(Intent.ACTION_DIAL);
                dial.setData((Uri.parse("tel:" + phone)));
                startActivity(dial);

            }
        });

        homedial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}