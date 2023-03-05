package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.menucam:
                startActivity(new Intent(getApplicationContext(), Camera_Activity.class));
                return true;
            case R.id.menusms:
                startActivity(new Intent(getApplicationContext(), SMS.class));
                return true;
            case R.id.menuimg:
                startActivity(new Intent(getApplicationContext(), ImageActivity.class));
                return true;
            case R.id.menucall:
                startActivity(new Intent(getApplicationContext(), CallActivity.class));
                return true;
            case R.id.onClickListener:
              startActivity(new Intent(getApplicationContext(), mycalculator.class));
                return true;
            case R.id.onClick:
                startActivity(new Intent(getApplicationContext(), OnclickCalcu_Activity.class));
                return true;
            case R.id.menureg:
                startActivity(new Intent(getApplicationContext(), Registration.class));
                return true;
            case R.id.menucalendar:
                startActivity(new Intent(getApplicationContext(), Calendar.class));
                return true;
            case R.id.menuurl:
                startActivity(new Intent(getApplicationContext(), URLActivity.class));
                return true;
            case R.id.menuabout:
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                return true;
            case R.id.menuexit:
                finishAffinity();
                return true;
            case R.id.menulogout:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}