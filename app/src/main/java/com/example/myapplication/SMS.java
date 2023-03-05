package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SMS extends AppCompatActivity {

    EditText txtphonenum, txtsms;
    Button send, homesms;
    TextView txtcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

       txtphonenum=findViewById(R.id.txtphonenum);
       txtsms=findViewById(R.id.txtsms);
       send=findViewById(R.id.send);
       homesms=findViewById(R.id.homesms);
       txtcount=findViewById(R.id.txtcount);

       txtsms.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               txtcount.setText(txtsms.getText().length() + "/250");
               if(txtsms.getText().length() == 250){
                   txtcount.setTextColor(Color.RED);
               }else{
                   txtcount.setTextColor(Color.BLUE);
               }

           }

           @Override
           public void afterTextChanged(Editable s) {

           }
       });

        homesms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();

            }
        });
        send.setOnClickListener(v->btnsendmessage());

    }
    public void btnsendmessage (){
        String phone = txtphonenum.getText().toString();
        String message = txtsms.getText().toString();

        Intent sms = new Intent(Intent. ACTION_VIEW, Uri.parse("smsto:"));
        sms.setType("vnd.android-dir/mms-sms");
        sms.putExtra("address", phone);
        sms.putExtra("sms_body", message);

        startActivity(sms);



    }




}