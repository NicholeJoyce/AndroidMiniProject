package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin, btnexit;
    EditText uname, upass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btnlogin);
        btnexit = findViewById(R.id.btnexit);
        uname = findViewById(R.id.uname);
        upass = findViewById(R.id.upass);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = uname.getText().toString();
                String password = upass.getText().toString();

                if(username.isEmpty()){
                    uname.setError("Username is Empty!");
                }
                if(password.isEmpty()){
                    upass.setError("Password is Empty");
                }
                if(username.equals("nicholejoyce") && password.equals("NULIT")){
                    startActivity(new Intent(MainActivity.this, Home.class));
                    uname.getText().clear();
                    upass.getText().clear();
                }else{
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                    uname.getText().clear();
                    upass.getText().clear();

                }

            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });


    }
}