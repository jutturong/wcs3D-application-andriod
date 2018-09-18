package com.example.android.wcs3d;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class Prelogin extends Activity {

	// Splash screen timer
	//private static int SPLASH_TIME_OUT = 3000;


	ImageView  imgLogin;

	ImageView  imgMember;

	ImageView  imgGuest;





	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);



		/*setContentView(R.layout.activity_splash);*/

		/*setContentView(R.layout.layout1);*/
		setContentView(R.layout.layout2); /*login system */
		/*setContentView(R.layout.layoutprelogin);*/ /*prelogin */













		imgLogin=(ImageView)findViewById(R.id.imageLogin);

		imgLogin.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {

				Toast.makeText(Prelogin.this,
						"เข้าสู่ระบบการทำงาน Tawanchai kku application ",
						Toast.LENGTH_LONG).show();

			}
		});

		imgMember=(ImageView)findViewById(R.id.imageMember);
		imgMember.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(Prelogin.this,
						"สมัครสมาชิก Tawanchai kku application",
						Toast.LENGTH_LONG).show();
			}
		});
//เข้าเยี่ยมชม
		imgGuest=(ImageView)findViewById(R.id.imageGuest);
		imgGuest.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(Prelogin.this,
						"เข้าเยี่ยมชม Tawanchai kku application",
						Toast.LENGTH_LONG).show();


				Intent i = new Intent(Prelogin.this, guestMainSystem.class);
				startActivity(i);
				finish();

			}
		});






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
