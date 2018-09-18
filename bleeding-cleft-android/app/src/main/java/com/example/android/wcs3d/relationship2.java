package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 24/7/2561.
 */

public class relationship2 extends Activity {

    ImageView imgback;
    ImageView imgmenu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutrelationship2);

        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(relationship2.this,relationships.class);
                startActivity(i);
                finish();
            }
        });

        imgmenu=(ImageView)findViewById(R.id.imgmenu);
        imgmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(relationship2.this,mainFeeding.class);
                startActivity(i);
                finish();
            }
        });


    }
}
