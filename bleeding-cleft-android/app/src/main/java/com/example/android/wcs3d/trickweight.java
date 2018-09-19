package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class trickweight  extends Activity {

    ImageView  imageBack; //ถอยหลัง

    ImageView imgforword; //ไปเมนูหลัก

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layouttrickweight);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //fix ด้านตั้ง

        imageBack=(ImageView)findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(trickweight.this, mainFeeding.class);
                startActivity(i);
                finish();

            }
        });

        imgforword=(ImageView)findViewById(R.id.imgforword);
        imgforword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(trickweight.this,mainFeeding.class);
                startActivity(i);
                finish();
            }
        });

    }
}
