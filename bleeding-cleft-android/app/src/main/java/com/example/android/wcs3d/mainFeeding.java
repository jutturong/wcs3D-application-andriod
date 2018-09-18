package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 10/7/2561.
 */



public class mainFeeding  extends Activity {

    ImageView  imageBack; //ย้อนกลับรายการหลัก

    ImageView  imagekeepmilk; //บีบและเก็บรักษาน้ำนม


    ImageView  imgbenifitfeeding; //ประโยชน์ของน้ำนมมารดา


    ImageView  imgbeginfeeding; //เริ่มต้นดูดนมแม่


    ImageView imgtrickweight; //เคล็ดลับการเพิ่มน้ำหนัก

    ImageView imgdaysurgery; //เมืื่อวันผ่าตัดมาถึง

    ImageView imgissue; //ปัญหาที่พบบ่อย

    ImageView imgfrequency; //ระยะห่างในการให้นม

    ImageView imageVDO;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layoutmainfeeding);

//ย้อนกลับ
        imageBack=(ImageView)findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(mainFeeding.this, guestMainSystem.class);
                startActivity(i);
                finish();



            }
        });

//บีบและเก็บรักษาน้ำนม
        imagekeepmilk=(ImageView)findViewById(R.id.imagekeepmilk);
        imagekeepmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainFeeding.this, keepmilk.class);
                startActivity(i);
                finish();
            }
        });

//ประโยชน์ของน้ำนมมารดา
        imgbenifitfeeding=(ImageView)findViewById(R.id.imgbenifitfeeding);
        imgbenifitfeeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainFeeding.this, benifitfeeding.class);
                startActivity(i);
                finish();
            }
        });

        //เริ่มต้นดูดนมแม่
        imgbeginfeeding=(ImageView)findViewById(R.id.imgbeginfeeding);
        imgbeginfeeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainFeeding.this, beginfeeding.class);
                startActivity(i);
                finish();
            }
        });

//เคล็ดลับการเพิ่มน้ำหนักทารก
        imgtrickweight=(ImageView)findViewById(R.id.imgtrickweight);
        imgtrickweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mainFeeding.this, trickweight.class);
                startActivity(i);
                finish();
            }
        });

        //เมื่อวันผ่าตัดมาถึง
        imgdaysurgery=(ImageView)findViewById(R.id.imgdaysurgery);
        imgdaysurgery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mainFeeding.this, daysurgery.class);
                startActivity(i);
                finish();
            }
        });

        //ปัญหาที่พบบ่อย
        imgissue=(ImageView)findViewById(R.id.imgissue);
        imgissue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(mainFeeding.this, issue.class );
                startActivity(i);
                finish();

            }
        });

       //ระยะห่างในการให้นม
        imgfrequency=(ImageView)findViewById(R.id.imgfrequency);
        imgfrequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mainFeeding.this, frequency.class);
                startActivity(i);
                finish();
            }
        });

  //รับชม VDO

        imageVDO=(ImageView)findViewById(R.id.imgvdo);
        imageVDO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*

                Intent newActivity0 = new Intent (mainFeeding.this, thai101.class);

                newActivity0.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                startActivity(newActivity0);
                */

                Intent newActivity0 = new Intent (mainFeeding.this, activeVDO.class);

                newActivity0.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                startActivity(newActivity0);
            }
        });


    }
}
