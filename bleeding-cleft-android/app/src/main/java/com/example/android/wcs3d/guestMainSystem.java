package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by linux on 4/7/2561.
 */

public class guestMainSystem  extends Activity {


    TextView imgLogin;

    TextView imaSignup;


    ImageView imageFeeding; //การให้นมทารก




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.layoutguestmainsystem);

        //ปรับหน้าใหม่
        setContentView(R.layout.layoutguestmainsystem2);
        //การให้นมทารก

        imageFeeding=(ImageView)findViewById(R.id.imageFeeding);
        imageFeeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                Intent i = new Intent(guestMainSystem.this, mainFeeding.class);
                startActivity(i);
                finish();


            }
        });


        //เข้าสู่ระบบ
/*
        imgLogin=(TextView)findViewById(R.id.imgLogin);
        imgLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(guestMainSystem.this, formLogin.class);
                startActivity(i);
                finish();

            }
        });
*/

        //สมัครสมาชิก
/*
        imaSignup=(TextView)findViewById(R.id.imaSignup);
        imaSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(guestMainSystem.this, formsignup.class);
                startActivity(i);
                finish();
            }
        });
*/



    }

}
