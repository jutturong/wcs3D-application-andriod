package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 18/7/2561.
 */

public class belch extends Activity {

    ImageView imgback;
    ImageView imgmenu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layoutbelch);


        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(belch.this,nipple2.class);
                startActivity(i);
                finish();
            }
        });

        /*
        imgforword=(ImageView)findViewById(R.id.imgforword);
        imgforword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
        */

        imgmenu=(ImageView)findViewById(R.id.imgmenu);
        imgmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(belch.this,mainFeeding.class);
                startActivity(i);
                finish();
            }
        });

    }
}
