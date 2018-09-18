package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 6/7/2561.
 */

public class formsignup  extends Activity {

ImageView imageUpload; //อัพโหลดรูปภาพ
    static final int REQUEST_IMAGE_CAPTURE = 1;


 ImageView imageLogin; //เข้าสู่ระบบ
    ImageView imageGuest; //เข้าเยี่ยมชม

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutformsignup);


        imageUpload=(ImageView)findViewById(R.id.imageUpload);
        imageUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }

            }
        });

        //เข้าสู่ระบบ
        imageLogin=(ImageView)findViewById(R.id.imageLogin);
        imageLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formsignup.this, formLogin.class);
                startActivity(i);
                finish();

            }
        });

        //เข้าเยี่ยมชม
        imageGuest=(ImageView)findViewById(R.id.imageGuest);
        imageGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formsignup.this, guestMainSystem.class);
                startActivity(i);
                finish();
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageUpload.setImageBitmap(imageBitmap);
        }
    }


}
