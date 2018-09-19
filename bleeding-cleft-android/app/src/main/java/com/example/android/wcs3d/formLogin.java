package com.example.android.wcs3d;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by linux on 4/7/2561.
 */

public class formLogin  extends Activity {

EditText editLogin;
EditText editPass;
ImageView imgLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layoutformlogin);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //fix ด้านตั้ง


        // edit username
        editLogin=(EditText)findViewById(R.id.edituser);
        //editLogin.getText();

        //edit password
        editPass=(EditText)findViewById(R.id.editpassword);

        imgLogin= (ImageView)findViewById(R.id.imageLogin);
        imgLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(formLogin.this,
                        "เข้าสู่ระบบ  user: " +  editLogin.getText() + " password : " + editPass.getText(),
                        Toast.LENGTH_LONG).show();
            }
        });


        //เข้าเยี่ยมชม
        ImageView imgGuest=(ImageView)findViewById(R.id.imageView9);
        imgGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                Toast.makeText(formLogin.this,
                        "เข้าสู่ระบบ  user: " +  editLogin.getText() + " password : " + editPass.getText(),
                        Toast.LENGTH_LONG).show();
                        */

                Intent i = new Intent(formLogin.this,guestMainSystem.class);
                startActivity(i);
                finish();


            }
        });


        //สมัครสมาชิก
        ImageView  imgSignup=(ImageView)findViewById(R.id.imageView8);
        imgSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(formLogin.this,formsignup.class);
                startActivity(i);
                finish();
            }
        });


    }

}
