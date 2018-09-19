package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 10/7/2561.
 */

public class keepmilk  extends Activity {



ImageView imageBack;

ImageView imgforword;







    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.layoutkeepmilk);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //fix ด้านตั้ง

        imageBack=(ImageView)findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(keepmilk.this,mainFeeding.class);
                startActivity(i);
                finish();
            }
        });


        imgforword=(ImageView)findViewById(R.id.imgforword);
        imgforword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                /*
                Intent i = new Intent(keepmilk.this,keepmilk2.class);
                startActivity(i);
                finish();
                  */

                Intent i = new Intent(keepmilk.this,techniquesqueeze.class);
                startActivity(i);
                finish();



            }
        });







    }


}
