package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class URLActivity extends AppCompatActivity {
    EditText txturl;
    Button btnnav, homeurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urlactivity);

        txturl = findViewById(R.id.txturl);
        btnnav = findViewById(R.id.btnnav);


    }
    public void btnhomeurl(){
        finish();
    }

    public void btnnavigate(View view) {
        String url = "http://" + txturl.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
    }
