package com.example.android.wcs3d;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class SplashScreen extends Activity {

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {

			/*
			 * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity


    /*           Intent i = new Intent(Intent.ACTION_MAIN);
               i.addCategory(Intent.CATEGORY_HOME);
               i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      */

                //Intent i=new Intent();
               // i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
               // i.setAction(Intent.ACTION_MAIN);



               // Intent i = new Intent(, MainActivity.class);
               // i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NO_HISTORY);



             /*
			   Intent intent=new Intent("com.example.android.wcs3d");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                */
                  Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
			}
		}, SPLASH_TIME_OUT);
	}

}
