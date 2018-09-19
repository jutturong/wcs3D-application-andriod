package com.example.android.wcs3d;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by linux on 18/9/2561.
 */

public class activeVDO extends Activity

{

    String TAG = "list";
    //String th101="http://www.caiproject.com/subjects/thai/season3/101/video/thai101ad.mp4";
    String url_unit1="https://kkucleft.kku.ac.th/appvdo/bleeding_unit1.mp4";
    //https://kkucleft.kku.ac.th/appvdo/bleeding_unit1.mp4
    private ProgressDialog progress = null;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo);


         this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

      /* this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT); //ด้านตั้ง  */


        final VideoView video1=(VideoView)findViewById(R.id.videoView1);
       // video1.setVideoPath(th101);
        video1.setVideoPath(url_unit1);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(video1);
        video1.setMediaController(mediaController);

        Toast.makeText( getBaseContext(),"รอสักครู่...", Toast.LENGTH_SHORT).show(); //text preloading..

        video1.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){

            @Override
            public void onPrepared(MediaPlayer mp) {
                Log.i(TAG, "Duration = " +  video1.getDuration());
            }
        });

        video1.requestFocus();  //comment1


        video1.start();
        // finish(); //comment
    }




}
