package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OnclickCalcu_Activity extends AppCompatActivity {
    EditText num1, num2, result;
    Button btnadd, btnsub, btndiv, btnmul, btnhomecalcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclick_calcu);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btndiv = findViewById(R.id.btndiv);
        btnmul = findViewById(R.id.btnmul);
        btnhomecalcu = findViewById(R.id.btnhomecalcu);
        result = findViewById(R.id.result);
    }

    public void add(View v) {
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int sum = number1 + number2;
        result.setText(String.valueOf(sum));
    }

    public void sub(View v) {
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int difference = number1 - number2;
        result.setText(String.valueOf(difference));

    }

    public void div(View v) {
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int quotient = number1 / number2;
        result.setText(String.valueOf(quotient));
    }

    public void mul(View v) {

    int number1 = Integer.parseInt(num1.getText().toString());
    int number2 = Integer.parseInt(num2.getText().toString());
    int product = number1 * number2;
    result.setText(String.valueOf(product));
}

public void homecalcu(View v){
        finish();
}

}