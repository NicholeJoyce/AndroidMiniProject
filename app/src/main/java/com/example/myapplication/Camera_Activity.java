package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camera_Activity extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    ImageView showpic;
    Button cam, homecamera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        showpic = findViewById(R.id.showpic);
        cam = findViewById(R.id.cam);
        homecamera = findViewById(R.id.homecamera);

        cam.setOnClickListener((view -> shutter()));
        homecamera.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                finish();
            }
        });
    }

    public void shutter() {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityIfNeeded(i, CAMERA_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b = (Bitmap) data.getExtras().get("data");
        showpic.setImageBitmap(b);


    }


}


