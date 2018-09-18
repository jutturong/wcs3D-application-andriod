package com.example.android.wcs3d;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;


public class SplashScreen extends Activity {

	// Splash screen timer
	//private static int SPLASH_TIME_OUT = 3000;



	ImageView  imageOld; //สมาชิกเก่า
	ImageView  imageNew; //สมาชิกใหม่

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/*setContentView(R.layout.activity_splash);*/

		/*setContentView(R.layout.layout1);*/
		/*setContentView(R.layout.layout2);*/ /*login system เข้าสู่ระบบ */

        //ปรับส่งไปหน้าระบบหลักเลย แก้ไขใหม่จากการประชุม นำเสนองาน 25-7-61
		//setContentView(R.layout.layoutguestmainsystem);
		Intent i = new Intent(SplashScreen.this, guestMainSystem.class);
		startActivity(i);
		finish();




		/*prelogin  ก่อนเข้าสู่ระบบ*/
		/*
		setContentView(R.layout.layoutprelogin);

		imageOld=(ImageView)findViewById(R.id.imageOld);
		imageOld.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(SplashScreen.this,
						"ผู้ป่วยตะวันฉาย Tawanchai kku application ",
						Toast.LENGTH_LONG).show();
			}
		});

		imageNew=(ImageView)findViewById(R.id.imageNew);
		imageNew.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Toast.makeText(SplashScreen.this,
						"สมาชิกใหม่ Tawanchai kku application ",
						Toast.LENGTH_LONG).show();



				Intent i = new Intent(SplashScreen.this, Prelogin.class);
				startActivity(i);
				finish();


			}
		});
        */








/*
		new Handler().postDelayed(new Runnable() {



			@Override
			public void run() {



                  Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
			}
		}, SPLASH_TIME_OUT);
*/




	}

}
