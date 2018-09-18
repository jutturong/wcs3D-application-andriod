package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 11/7/2561.
 */

public class benifitfeeding extends Activity {

    ImageView imgforword;  //ไปข้างหน้า
    ImageView imgback; //ไปข้างหลัง


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layoutbenifitfeeding);

        imgforword=(ImageView)findViewById(R.id.imgforword);
        imgforword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(benifitfeeding.this, speaking.class);
                startActivity(i);
                finish();


            }
        });

        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(benifitfeeding.this,mainFeeding.class);
                startActivity(i);
                finish();



            }
        });


    }

}
