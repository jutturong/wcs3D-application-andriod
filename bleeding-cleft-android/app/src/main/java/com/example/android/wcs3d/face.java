package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linux on 23/7/2561.
 */

public class face  extends Activity {

    ImageView imgback;
    ImageView imgprev;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layoutface);

        imgback=(ImageView)findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(face.this, speaking.class);
                startActivity(i);
                finish();
            }
        });

        imgprev=(ImageView)findViewById(R.id.imgprev);
        imgprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(face.this, relationships.class);
                startActivity(i);
                finish();
            }
        });



    }
}
