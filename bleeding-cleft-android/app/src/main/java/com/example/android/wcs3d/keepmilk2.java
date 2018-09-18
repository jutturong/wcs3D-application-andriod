package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 13/7/2561.
 */

public class keepmilk2  extends Activity {

   ImageView imgback;
   ImageView imgmenu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.layoutkeepmilk2);



        /*
         Intent i = new Intent(trickweight.this,guestMainSystem.class);
                startActivity(i);
                finish();
         */

        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(keepmilk2.this,keepmilk.class);
                startActivity(i);
                finish();
            }
        });

        imgmenu=(ImageView)findViewById(R.id.imgmenu);
        imgmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(keepmilk2.this,mainFeeding.class);
                startActivity(i);
                finish();
            }
        });

    }
}
