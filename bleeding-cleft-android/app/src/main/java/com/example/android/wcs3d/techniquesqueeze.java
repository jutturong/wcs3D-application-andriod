package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 23/7/2561.
 */

public class techniquesqueeze extends Activity {

    ImageView imgback;
    ImageView imgforword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layouttechniquesqueeze);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //fix ด้านตั้ง


        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(techniquesqueeze.this, keepmilk.class);
                startActivity(i);
                finish();
            }
        });

        imgforword=(ImageView)findViewById(R.id.imgforword);
        imgforword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(techniquesqueeze.this, keepmilk2.class);
                startActivity(i);
                finish();
            }
        });



    }
}
