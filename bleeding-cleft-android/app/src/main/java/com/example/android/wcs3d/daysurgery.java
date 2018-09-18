package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 19/7/2561.
 */

public class daysurgery extends Activity {

    ImageView imgback;

    ImageView imgforword;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layoutdaysurgery);

        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(daysurgery.this, mainFeeding.class);
                startActivity(i);
                finish();
            }
        });

        imgforword=(ImageView)findViewById(R.id.imgforword);
        imgforword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(daysurgery.this, protectsurgery.class);
                startActivity(i);
                finish();
            }
        });

    }
}
