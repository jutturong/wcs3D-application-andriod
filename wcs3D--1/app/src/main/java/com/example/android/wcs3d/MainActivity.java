package com.example.android.wcs3d;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;


import android.view.Surface;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.MediaController;
import android.widget.Toast;

import android.content.Intent;
import android.widget.VideoView;
import android.util.Log;
import android.net.Uri;

import android.media.MediaPlayer;

import android.R.*;

public class MainActivity extends ActionBarActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    private MediaPlayer mediaPlayer;

    private  String url="";

    private  String TAG = "list";
   // private   VideoView video1;

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // import class
       // thai th=new  thai();


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);


        expListView.setOnGroupClickListener(new OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {

                return false;
            }
        });




        expListView.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                if( groupPosition==0) switch (childPosition)
                {
                    case 0:

                      //  startActivity(new Intent(MainActivity.this,thai101.class));//OK

                        Intent newActivity0 = new Intent (MainActivity.this, thai101.class);

                        newActivity0.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity0);


                        break;
                    case 1:
                       // thai102();
                        Intent newActivity1 = new Intent (MainActivity.this, thai102.class);

                        newActivity1.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity1);


                        break;
                    case 2: //103

                      //  url="http://www.caiproject.com/subjects/thai/season3/103/video/thai103ad.mp4";
                     //   thai_section(url);

                        Intent newActivity2 = new Intent (MainActivity.this, thai103.class);

                        newActivity2.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity2);

                        break;
                    case 3: //104
                      //  url="http://www.caiproject.com/subjects/thai/season3/104/video/thai104ad.mp4";
                      //  thai_section(url);
                        Intent newActivity3 = new Intent (MainActivity.this, thai104.class);

                        newActivity3.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity3);

                        break;
                    case 4: //105
                   // url="http://www.caiproject.com/subjects/thai/season3/105/video/thai105ad.mp4";
                   // thai_section(url);
                        Intent newActivity4 = new Intent (MainActivity.this, thai105.class);

                        newActivity4.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity4);

                    break;

                    case 5: //106 นักพูดคนเก่ง
                     //   url="http://www.caiproject.com/subjects/thai/season3/106/video/thai106ad.mp4";
                     //   thai_section(url);
                        Intent newActivity5 = new Intent (MainActivity.this, thai106.class);

                        newActivity5.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity5);

                        break;

                    case 6: //107กำเนิดของเสียง
                        //url="http://www.caiproject.com/subjects/thai/season3/107/video/thai107ad.mp4";
                       // thai_section(url);
                        Intent newActivity6 = new Intent (MainActivity.this, thai107.class);

                        newActivity6.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity6);

                        break;

                    case 7: //108 การสร้างคำนำความหมาย
                       // url="http://www.caiproject.com/subjects/thai/season3/108/video/thai108ad.mp4";
                      //  thai_section(url);
                        Intent newActivity7 = new Intent (MainActivity.this, thai108.class);

                        newActivity7.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity7);

                        break;
                    case 8: //109ฉันเป็นใครเธอรู้ไหม
                      //  url="http://www.caiproject.com/subjects/thai/season3/109/video/thai109ad.mp4";
                      //  thai_section(url);
                        Intent newActivity8 = new Intent (MainActivity.this, thai109.class);

                        newActivity8.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity8);

                        break;
                    case 9: //110 หน้าที่ของฉันสำคัญไฉน
                       // url="http://www.caiproject.com/subjects/thai/season3/110/video/thai110ad.mp4";
                      // thai_section(url);
                        Intent newActivity9 = new Intent (MainActivity.this, thai110.class);

                        newActivity9.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity9);

                        break;
                    case 10: //111     เรียงร้อยถ้อยคำเป็นคำกลอน

                     //   url="http://www.caiproject.com/subjects/thai/season3/111/video/thai111ad.mp4";
                     //   thai_section(url);
                        Intent newActivity10 = new Intent (MainActivity.this, thai111.class);

                        newActivity10.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity10);

                        break;
                    case 11:  //112  โคลงโลกนิติ
                       // url="http://www.caiproject.com/subjects/thai/season3/112/video/thai112ad.mp4";
                       // thai_section(url);
                        Intent newActivity11 = new Intent (MainActivity.this, thai112.class);

                        newActivity11.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity11);
                        break;
                    case 12: //113   สังข์ทอง
                       // url="http://www.caiproject.com/subjects/thai/season3/113/video/thai113ad.mp4";
                       // thai_section(url);
                        Intent newActivity12 = new Intent (MainActivity.this, thai113.class);

                        newActivity12.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity12);
                        break;
                    case 13:  //214
                      //  url="http://www.caiproject.com/subjects/thai/season3/214/video/thai214ad.mp4";
                      //  thai_section(url);
                        Intent newActivity13 = new Intent (MainActivity.this, thai214.class);

                        newActivity13.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity13);

                        break;
                    case 14: //215 สะท้อนนักเขียน
                       // url="http://www.caiproject.com/subjects/thai/season3/215/video/thai215ad.mp4";
                       // thai_section(url);
                        Intent newActivity14 = new Intent (MainActivity.this, thai215.class);

                        newActivity14.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity14);
                        break;
                    case 15: //216  สะท้อนเรื่องที่ฟังและพูด
                   // url="http://www.caiproject.com/subjects/thai/season3/216/video/thai216ad.mp4";
                   // thai_section(url);
                        Intent newActivity15 = new Intent (MainActivity.this, thai216.class);

                        newActivity15.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity15);
                    break;

                    case 16: //217 พรแห่งความหวัง

                      //  url="http://www.caiproject.com/subjects/thai/season3/217/video/thai217ad.mp4";
                      //  thai_section(url);
                        Intent newActivity16 = new Intent (MainActivity.this, thai217.class);

                        newActivity16.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity16);

                        break;

                    case 17: // 218  โน้มใจให้เชื่อ

                  //  url="http://www.caiproject.com/subjects/thai/season3/218/video/thai218ad.mp4";
                  //  thai_section(url);

                        Intent newActivity17 = new Intent (MainActivity.this, thai218.class);

                        newActivity17.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity17);


                    break;

                    case 18: //219  พูดดีมีเงิน
                      //  url="http://www.caiproject.com/subjects/thai/season3/219/video/thai219ad.mp4";
                      //  thai_section(url);
                        Intent newActivity18 = new Intent (MainActivity.this, thai219.class);

                        newActivity18.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity18);

                        break;

                    case 19: //220  เพื่อนสอนเพื่อน
                       // url="http://www.caiproject.com/subjects/thai/season3/220/video/thai220ad.mp4";
                       // thai_section(url);
                        Intent newActivity19 = new Intent (MainActivity.this, thai220.class);

                        newActivity19.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity19);
                        break;
                }
             else if(  groupPosition==1) switch (childPosition) //math
                {
                    case 0: //math 101 แทนแกรม 7 ชิ้นสร้างสรรค์
                       // url="http://www.caiproject.com/subjects/math/season3/101/video/math101ad.mp4";
                       // thai_section(url);

                        Intent newActivity0 = new Intent (MainActivity.this, math101.class);

                        newActivity0.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                        startActivity(newActivity0);

                        break;

                     case 1: //math 102  การหาตัวคูณร่วมน้อย
                      //  url="http://www.caiproject.com/subjects/math/season3/102/video/math102ad.mp4";
                      //  thai_section(url);
                         Intent newActivity1 = new Intent (MainActivity.this, math102.class);

                         newActivity1.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                         startActivity(newActivity1);
                        break;
                     case 2: //math 103  การแยกตัวประกอบและจำนวนตัวประกอบ
                       // url="http://www.caiproject.com/subjects/math/season3/103/video/math103ad.mp4";
                      //  thai_section(url);
                         Intent newActivity2 = new Intent (MainActivity.this, math103.class);
                         newActivity2.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                         startActivity(newActivity2);
                         break;
                     case 3: //math 104  การแยกตัวประกอบ
                      //  url="http://www.caiproject.com/subjects/math/season3/104/video/math104ad.mp4";
                      //  thai_section(url);
                         Intent newActivity3 = new Intent (MainActivity.this, math104.class);
                         newActivity3.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                         startActivity(newActivity3);

                        break;
                    case 4: //math 105  ตัวประกอบและตัวประกอบร่วม
                   // url="http://www.caiproject.com/subjects/math/season3/105/video/math105ad.mp4";
                  //  thai_section(url);
                        Intent newActivity4 = new Intent (MainActivity.this, math105.class);
                        newActivity4.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity4);
                    break;

                    case 5: //math 106  ยังไม่ทำ VDO เริ่มจากนี้***********************
                    //    url="http://www.caiproject.com/subjects/math/season3/106/video/math106ad.mp4";
                     //   thai_section(url);
                        Intent newActivity5 = new Intent (MainActivity.this, math106.class);
                        newActivity5.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity5);
                        break;

                    case 6: //math 107  กลยุทธ์เดาแล้วตรวจคำตอบ
                       // url="http://www.caiproject.com/subjects/math/season3/107/video/math107ad.mp4";
                       // thai_section(url);
                        Intent newActivity6 = new Intent (MainActivity.this, math107.class);
                        newActivity6.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity6);

                        break;
                    case 7: //math 108  กลยุทธ์สมเหตุสมผล
                  //  url="http://www.caiproject.com/subjects/math/season3/108/video/math108ad.mp4";
                  //  thai_section(url);
                        Intent newActivity7 = new Intent (MainActivity.this, math108.class);
                        newActivity7.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity7);

                       break;
                    case 8: //math 109  การใช้ไดอะแกรมแก้ปัญหา
                      //  url="http://www.caiproject.com/subjects/math/season3/109/video/math109ad.mp4";
                       // thai_section(url);
                        Intent newActivity8 = new Intent (MainActivity.this, math109.class);
                        newActivity8.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity8);

                        break;
                    case 9: //math 110  การใช้ตารางแก้ปัญหา
                       // url="http://www.caiproject.com/subjects/math/season3/110/video/math110ad.mp4";
                       // thai_section(url);
                        Intent newActivity9 = new Intent (MainActivity.this, math110.class);
                        newActivity9.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity9);
                        break;
                    case 10: //math 111  มาเรียนรู้จากกระเบื้องปูพื้น
                      //  url="http://www.caiproject.com/subjects/math/season3/111/video/math111ad.mp4";
                      //  thai_section(url);
                        Intent newActivity10 = new Intent (MainActivity.this, math111.class);
                        newActivity10.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity10);

                        break;
                    case 11: //math 112  บั้งไฟยโสธร
                       // url="http://www.caiproject.com/subjects/math/season3/112/video/math112ad.mp4";
                       // thai_section(url);
                        Intent newActivity11 = new Intent (MainActivity.this, math112.class);
                        newActivity11.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity11);
                        break;
                    case 12: //math 113  แกนสมมาตร
                       // url="http://www.caiproject.com/subjects/math/season3/113/video/math113ad.mp4";
                       // thai_section(url);
                        Intent newActivity12 = new Intent (MainActivity.this, math113.class);
                        newActivity12.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity12);

                        break;
                    case 13: //math 114  การสวมใส่และการแก้สมการ 1
                       // url="http://www.caiproject.com/subjects/math/season3/114/video/math114ad.mp4";
                       // thai_section(url);
                        Intent newActivity13 = new Intent (MainActivity.this, math114.class);
                        newActivity13.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity13);

                        break;
                    case 14: //math 115  การสวมใส่และการแก้สมการ 2
                     //   url="http://www.caiproject.com/subjects/math/season3/115/video/math115ad.mp4";
                     //   thai_section(url);
                        Intent newActivity14 = new Intent (MainActivity.this, math115.class);
                        newActivity14.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity14);

                        break;
                    case 15: //math 116  การสวมใส่และการแก้สมการ 3
                  //  url="http://www.caiproject.com/subjects/math/season3/116/video/math116ad.mp4";
                  //  thai_section(url);
                        Intent newActivity15 = new Intent (MainActivity.this, math116.class);
                        newActivity15.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity15);

                        break;
                    case 16: //math 117
                 //   url="http://www.caiproject.com/subjects/math/season3/117/video/math117ad.mp4";
                 //   thai_section(url);
                        Intent newActivity16 = new Intent (MainActivity.this, math117.class);
                        newActivity16.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity16);

                        break;
                    case 17: //math 118
                       // url="http://www.caiproject.com/subjects/math/season3/118/video/math118ad.mp4";
                       // thai_section(url);
                        Intent newActivity17 = new Intent (MainActivity.this, math118.class);
                        newActivity17.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity17);

                        break;
                    case 18: //math 119
                      //  url="http://www.caiproject.com/subjects/math/season3/119/video/math119ad.mp4";
                      //  thai_section(url);
                        Intent newActivity18 = new Intent (MainActivity.this, math119.class);
                        newActivity18.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity18);
                        break;

                    case 19: //math 120
                      //  url="http://www.caiproject.com/subjects/math/season3/120/video/math120ad.mp4";
                      //  thai_section(url);
                        Intent newActivity19 = new Intent (MainActivity.this, math119.class);
                        newActivity19.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity19);

                        break;
                }
                else if(  groupPosition==2) switch (childPosition)
                {
                    case 0: // 101
                      //  url="http://www.caiproject.com/subjects/eng/season3/101/video/eng101ad.mp4";
                      //  thai_section(url);

                        Intent newActivity0 = new Intent (MainActivity.this, eng101.class);
                        newActivity0.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity0);


                        break;

                    case 1: // 102
                      //  url="http://www.caiproject.com/subjects/eng/season3/102/video/eng102ad.mp4";
                      //  thai_section(url);

                        Intent newActivity1 = new Intent (MainActivity.this, eng102.class);
                        newActivity1.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity1);

                        break;
                    case 2: // 103
                       // url="http://www.caiproject.com/subjects/eng/season3/103/video/eng103ad.mp4";
                       // thai_section(url);
                        Intent newActivity2 = new Intent (MainActivity.this, eng103.class);
                        newActivity2.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity2);
                        break;
                    case 3: // 104
                       // url="http://www.caiproject.com/subjects/eng/season3/104/video/eng104ad.mp4";
                       // thai_section(url);
                        Intent newActivity3 = new Intent (MainActivity.this, eng104.class);
                        newActivity3.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity3);

                        break;
                    case 4: // 105
                      //  url="http://www.caiproject.com/subjects/eng/season3/105/video/eng105ad.mp4";
                      //  thai_section(url);
                        Intent newActivity4 = new Intent (MainActivity.this, eng105.class);
                        newActivity4.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity4);
                        break;

                    case 5: // 106  ยังไม่ทำ VDO เริ่มจากนี้***********************
                      //  url="http://www.caiproject.com/subjects/eng/season3/106/video/eng106ad.mp4";
                      //  thai_section(url);
                        Intent newActivity5 = new Intent (MainActivity.this, eng106.class);
                        newActivity5.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity5);
                        break;

                    case 6: // 107
                      //  url="http://www.caiproject.com/subjects/eng/season3/107/video/eng107ad.mp4";
                      //  thai_section(url);
                        Intent newActivity6 = new Intent (MainActivity.this, eng107.class);
                        newActivity6.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(newActivity6);
                        break;
                    case 7: // 108
                        url="http://www.caiproject.com/subjects/eng/season3/108/video/eng108ad.mp4";
                        thai_section(url);
                        break;
                    case 8: // 109
                        url="http://www.caiproject.com/subjects/eng/season3/109/video/eng109ad.mp4";
                        thai_section(url);
                        break;
                    case 9: // 110
                        url="http://www.caiproject.com/subjects/eng/season3/110/video/eng110ad.mp4";
                        thai_section(url);
                        break;
                    case 10: // 111
                        url="http://www.caiproject.com/subjects/eng/season3/111/video/eng111ad.mp4";
                        thai_section(url);
                        break;
                    case 11: // 112
                        url="http://www.caiproject.com/subjects/eng/season3/112/video/eng112ad.mp4";
                        thai_section(url);
                        break;
                    case 12: // 113
                        url="http://www.caiproject.com/subjects/eng/season3/113/video/eng113ad.mp4";
                        thai_section(url);
                        break;
                    case 13: // 114
                        url="http://www.caiproject.com/subjects/eng/season3/114/video/eng114ad.mp4";
                        thai_section(url);
                        break;
                    case 14: // 115
                        url="http://www.caiproject.com/subjects/eng/season3/115/video/eng115ad.mp4";
                        thai_section(url);
                        break;
                    case 15: // 116
                        url="http://www.caiproject.com/subjects/eng/season3/116/video/eng116ad.mp4";
                        thai_section(url);
                        break;
                    case 16: // 117
                        url="http://www.caiproject.com/subjects/eng/season3/117/video/eng117ad.mp4";
                        thai_section(url);
                        break;
                    case 17: // 118
                        url="http://www.caiproject.com/subjects/eng/season3/118/video/eng118ad.mp4";
                        thai_section(url);
                        break;
                    case 18: // 119
                        url="http://www.caiproject.com/subjects/eng/season3/119/video/eng119ad.mp4";
                        thai_section(url);
                        break;
                    case 19: //math 120
                        url="http://www.caiproject.com/subjects/eng/season3/120/video/eng120ad.mp4";
                        thai_section(url);
                        break;
                }
                else if(  groupPosition==3) switch (childPosition)
                {
                    case 0: // 101
                        url="http://www.caiproject.com/subjects/sci/season3/101/video/sci101ad.mp4";
                        thai_section(url);
                        break;
                    case 1: // 102
                    url="http://www.caiproject.com/subjects/sci/season3/102/video/sci102ad.mp4";
                    thai_section(url);
                    break;
                    case 2: // 103
                        url="http://www.caiproject.com/subjects/sci/season3/103/video/sci103ad.mp4";
                        thai_section(url);
                        break;
                    case 3: // 104
                        url="http://www.caiproject.com/subjects/sci/season3/104/video/sci104ad.mp4";
                        thai_section(url);
                        break;
                    case 4: // 105
                    url="http://www.caiproject.com/subjects/sci/season3/105/video/sci105ad.mp4";
                    thai_section(url);
                    break;
                    case 5: // 106
                        url="http://www.caiproject.com/subjects/sci/season3/106/video/sci106ad.mp4";
                        thai_section(url);
                        break;
                    case 6: // 107
                        url="http://www.caiproject.com/subjects/sci/season3/107/video/sci107ad.mp4";
                        thai_section(url);
                        break;
                    case 7: // 108
                    url="http://www.caiproject.com/subjects/sci/season3/108/video/sci108ad.mp4";
                    thai_section(url);
                    break;
                    case 8: // 109
                        url="http://www.caiproject.com/subjects/sci/season3/109/video/sci109ad.mp4";
                        thai_section(url);
                        break;
                    case 9: // 110
                        url="http://www.caiproject.com/subjects/sci/season3/110/video/sci110ad.mp4";
                        thai_section(url);
                        break;
                    case 10: // 111
                        url="http://www.caiproject.com/subjects/sci/season3/111/video/sci111ad.mp4";
                        thai_section(url);
                        break;
                    case 11: // 112
                        url="http://www.caiproject.com/subjects/sci/season3/112/video/sci112ad.mp4";
                        thai_section(url);
                        break;
                    case 12: // 113
                        url="http://www.caiproject.com/subjects/sci/season3/113/video/sci113ad.mp4";
                        thai_section(url);
                        break;
                    case 13: // 114
                        url="http://www.caiproject.com/subjects/sci/season3/114/video/sci114ad.mp4";
                        thai_section(url);
                        break;
                    case 14: // 115
                        url="http://www.caiproject.com/subjects/sci/season3/115/video/sci115ad.mp4";
                        thai_section(url);
                        break;
                    case 15: // 116
                        url="http://www.caiproject.com/subjects/sci/season3/116/video/sci116ad.mp4";
                        thai_section(url);
                        break;
                    case 16: // 117
                        url="http://www.caiproject.com/subjects/sci/season3/117/video/sci117ad.mp4";
                        thai_section(url);
                        break;
                    case 17: // 118
                        url="http://www.caiproject.com/subjects/sci/season3/118/video/sci118ad.mp4";
                        thai_section(url);
                        break;
                    case 18: // 119
                        url="http://www.caiproject.com/subjects/sci/season3/119/video/sci119ad.mp4";
                        thai_section(url);
                        break;
                    case 19: // 120
                        url="http://www.caiproject.com/subjects/sci/season3/120/video/sci120ad.mp4";
                        thai_section(url);
                        break;
                }
                else if(  groupPosition==4) switch (childPosition)
                {
                    case 0: // 101
                    url="http://www.caiproject.com/subjects/social/season3/101/video/social101ad.mp4";
                    thai_section(url);
                    break;
                    case 1: // 102
                        url="http://www.caiproject.com/subjects/social/season3/102/video/social102ad.mp4";
                        thai_section(url);
                        break;
                    case 2: // 103
                        url="http://www.caiproject.com/subjects/social/season3/103/video/social103ad.mp4";
                        thai_section(url);
                        break;
                    case 3: // 104
                    url="http://www.caiproject.com/subjects/social/season3/104/video/social104ad.mp4";
                    thai_section(url);
                    break;
                    case 4: // 105  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/105/video/social105ad.mp4";
                        thai_section(url);
                        break;
                    case 5: // 106  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/106/video/social106ad.mp4";
                        thai_section(url);
                        break;
                    case 6: // 107  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/107/video/social107ad.mp4";
                        thai_section(url);
                        break;
                    case 7: // 108  //*********BREAK VDO*************
                    url="http://www.caiproject.com/subjects/social/season3/108/video/social108ad.mp4";
                    thai_section(url);
                    break;
                    case 8: // 109  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/109/video/social109ad.mp4";
                        thai_section(url);
                        break;
                    case 9: // 110  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/110/video/social110ad.mp4";
                        thai_section(url);
                        break;
                    case 10: // 111  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/111/video/social111ad.mp4";
                        thai_section(url);
                        break;
                    case 11: // 112  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/112/video/social112ad.mp4";
                        thai_section(url);
                        break;
                    case 12: // 113  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/113/video/social113ad.mp4";
                        thai_section(url);
                        break;
                    case 13: // 114  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/114/video/social114ad.mp4";
                        thai_section(url);
                        break;
                    case 14: // 115  //*********BREAK VDO*************
                    url="http://www.caiproject.com/subjects/social/season3/115/video/social115ad.mp4";
                    thai_section(url);
                    break;
                    case 15: // 116  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/116/video/social116ad.mp4";
                        thai_section(url);
                        break;
                    case 16: // 117  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/117/video/social117ad.mp4";
                        thai_section(url);
                        break;
                    case 17: // 118  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/118/video/social118ad.mp4";
                        thai_section(url);
                        break;
                    case 18: // 119  //*********BREAK VDO*************
                    url="http://www.caiproject.com/subjects/social/season3/119/video/social119ad.mp4";
                    thai_section(url);
                    break;
                    case 19: // 120  //*********BREAK VDO*************
                        url="http://www.caiproject.com/subjects/social/season3/120/video/social120ad.mp4";
                        thai_section(url);
                        break;
                }

                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // ภาษาไทย 101
    public void thai101 ()
    {


        this.setContentView(R.layout.activity_vdo);
        try{

            final String TAG = "list";

            setContentView(R.layout.activity_vdo);
            this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            String link="http://www.caiproject.com/subjects/thai/season3/101/video/thai101ad.mp4";

            final VideoView video1=(VideoView)findViewById(R.id.videoView1);

            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(video1);

            Uri video=Uri.parse(link);

            video1.setMediaController(mediaController);
            video1.setVideoURI(video);

            Intent intent=new Intent(Intent.ACTION_VIEW,video);
            intent.setDataAndType(video,"video/mp4");
            mediaController.setAnchorView(video1);


            video1.requestFocus();

            video1.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){


                @Override
                public void onPrepared(MediaPlayer mp) {
                    Log.i(TAG, "Duration = " + video1.getDuration());
                }
            });

            video1.start();
            startActivity(intent);
            finish();


        }
        catch (Exception e){
            e.printStackTrace();
           // Toast.makeText(this,"Error connecting",Toast.LENGTH_SHORT).show();

        }







}
    public void thai102 ()
    {
        this.setContentView(R.layout.activity_vdo);
        try{

            setContentView(R.layout.activity_vdo);
            String link="http://www.caiproject.com/subjects/thai/season3/102/video/thai102ad.mp4";
            VideoView video1=(VideoView)findViewById(R.id.videoView1);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(video1);
            Uri video=Uri.parse(link);

            video1.setMediaController(mediaController);
            video1.setVideoURI(video);

            Intent intent=new Intent(Intent.ACTION_VIEW,video);
            intent.setDataAndType(video,"video/mp4");
            video1.requestFocus();
            startActivity(intent);
            finish();
        }
        catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this,"Error connecting",Toast.LENGTH_SHORT).show();
        }
    }
    public  void  thai_section(String url)
    {
        this.setContentView(R.layout.activity_vdo);
        try{

            setContentView(R.layout.activity_vdo);

           // String link="http://www.caiproject.com/subjects/thai/season3/102/video/thai102ad.mp4";
            String link=url;
            VideoView video1=(VideoView)findViewById(R.id.videoView1);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(video1);
            Uri video=Uri.parse(link);

            video1.setMediaController(mediaController);
            video1.setVideoURI(video);

            Intent intent=new Intent(Intent.ACTION_VIEW,video);
            intent.setDataAndType(video,"video/mp4");
            video1.requestFocus();
            startActivity(intent);
            finish();
        }
        catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this,"Error connecting",Toast.LENGTH_SHORT).show();
        }
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("ภาษาไทย");
        listDataHeader.add("คณิตศาสตร์");
        listDataHeader.add("ภาษาอังกฤษ");
        listDataHeader.add("วิทยาศาสตร์");
        listDataHeader.add("สังคมศึกษา");
       // listDataHeader.add("การงานอาชีพและเทคโนโลยี");  //bj

        // Adding child data
        List<String> thai = new ArrayList<String>();
        thai.add("ไพเราะเพราะขับขาน"); //101
        thai.add("ต้นไม้แห่งความรู้"); //102
        thai.add("คุณตาคนเก่ง"); //103
        thai.add("คู่หูชวนคิด"); //104
        thai.add("การเขียนรายงาน"); //105
        thai.add("นักพูดคนเก่ง"); //106
        thai.add("กำเนิดของเสียง");  //107
        thai.add("การสร้างคำนำความหมาย");  //108
        thai.add("ฉันเป็นใครเธอรู้ไหม"); //109
        thai.add("หน้าที่ของฉันสำคัญไฉน");//110
        thai.add("เรียงร้อยถ้อยคำเป็นคำกลอน");   //111      //เรียงร้อยถ้อยคำเป็นคำกลอน
        thai.add("โคลงโลกนิติ");  //112
        thai.add("สังข์ทอง");//113
        thai.add("นักเขียนตัวน้อย");  //214
        thai.add("สะท้อนนักเขียน");   //215
        thai.add("สะท้อนเรื่องที่ฟังและพูด");    //สะท้อนเรื่องที่ฟังและพูด   //216
        thai.add("พรแห่งความหวัง");    //พรแห่งความหวัง  217
        thai.add("โน้มใจให้เชื่อ");   //  โน้มใจให้เชื่อ  218
        thai.add("พูดดีมีเงิน"); //  219
        thai.add("เพื่อนสอนเพื่อน");//เพื่อนสอนเพื่อน 220



        List<String> math = new ArrayList<String>();
        math.add("แทนแกรม 7 ชิ้นสร้างสรรค์"); //101
        math.add("การหาตัวคูณร่วมน้อย"); //102
        math.add("การแยกตัวประกอบและจำนวน"); //103
        math.add("การแยกตัวประกอบ"); //104
        math.add("ตัวประกอบและตัวประกอบร่วม"); //105
        math.add("กลยุทธ์พื้นฐาน"); //106
        math.add("กลยุทธ์เดาแล้วตรวจคำตอบ"); //107
        math.add("กลยุทธ์สมเหตุสมผล"); //108
        math.add("การใช้ไดอะแกรมแก้ปัญหา"); //109
        math.add("การใช้ตารางแก้ปัญหา");  //110
        math.add("มาเรียนรู้จากกระเบื้องปูพื้น");   //111  มาเรียนรู้จากกระเบื้องปูพื้น
        math.add("บั้งไฟยโสธร"); //112 บั้งไฟยโสธร
        math.add("แกนสมมาตร"); //113 แกนสมมาตร
        math.add("การสวมใส่และการแก้สมการ 1"); //114/#.VObkn_msW30 การสวมใส่และการแก้สมการ 1
        math.add("การสวมใส่และการแก้สมการ 2"); //115/#.VObky_msW30 การสวมใส่และการแก้สมการ 2
        math.add("การสวมใส่และการแก้สมการ 3"); //116/#.VObk-_msW30  การสวมใส่และการแก้สมการ 3
        math.add("การสวมใส่และการแก้สมการ 4");  //117/#.VOblIvmsW30  การสวมใส่และการแก้สมการ 4
        math.add("การสวมใส่และการแก้สมการ 5"); //118/#.VOblTfmsW30 การสวมใส่และการแก้สมการ 5
        math.add("การสวมใส่และการแก้สมการ 6"); //119/#.VObldvmsW30 การสวมใส่และการแก้สมการ 6
        math.add("การสวมใส่และการแก้สมการ 7"); //120/#.VObloPmsW30  การสวมใส่และการแก้สมการ 7

        List<String> eng = new ArrayList<String>();
        eng.add("Greeting and leave taking 1"); // 101/index.php#.VOb0jPmsW30
        eng.add("When is your birthday");  //102/#.VOb0pfmsW30
        eng.add("At the Museum");  //103/#.VOb1MfmsW30
        eng.add("Where are you from?");  //104/#.VOb1VPmsW30
        eng.add("My Family"); //105/#.VOb1cPmsW30
        eng.add("My House"); // 106
        eng.add("Where are the telephones?");  //107
        eng.add("What are you doing?");  //108
        eng.add("What do you do");  //109
        eng.add("What does he look like"); //110
        eng.add("What time do you get up"); // 111
        eng.add("Can you swim");  //112
        eng.add("I’m going to wear my Jeans.");  //113
        eng.add("Let’s Celebrate.");  //114
        eng.add("She was smart."); //115
        eng.add("Did you have fun"); // 116
        eng.add("Where are you on vacation");  //117
        eng.add("Racing");  //118
        eng.add("Who wants to be a manager");  //119
        eng.add("My Favorite Pastimes"); //120

        List<String> sci = new ArrayList<String>();
        sci.add("สถานะของสาร"); //101/index.php#.VOqLuS7luUk
        sci.add("ความร้อนคืออะไร"); //102/index.php#.VOqLuS7luUk
        sci.add("ความร้อนมีผลต่อการเปลี่ยนแปลงของสารอย่างไร"); //103  ความร้อนมีผลต่อการเปลี่ยนแปลงของสารอย่างไร
        sci.add("ไขความลับกับการพาความร้อน"); //104  ไขความลับกับการพาความร้อน
        sci.add("ไขความลับกับการนำความร้อน");  //105 ไขความลับกับการนำความร้อน
        sci.add("ไขความลับกับการแผ่รังสีความร้อน");  //106 ไขความลับกับการนำความร้อน  **----Break test---------
        sci.add("มาจัดกลุ่มของสารตามลักษณะเนื้อสารและขนาดของอนุภาคกันเถอะ"); //107
        sci.add("สารละลาย");  //108
        sci.add("สมบัติของสารละลายกรดและสารละลายเบส");  //109
        sci.add("ค่า pH ของสารละลายกรดและเบส");   //110
        sci.add("กรดและเบสในชีวิตประจำวัน");   //111
        sci.add("ชั้นบรรยากาศ");   //112
        sci.add("อุณหภูมิอากาศ จริง");   //113
        sci.add("ความดันอากาศ");   //114
        sci.add("ลม");   //115
        sci.add("เรื่องความชื้นอากาศ");   //116
        sci.add("เมฆและฝน");   //117
        sci.add("พายุหมุนเขตร้อน");   //118
        sci.add("การพยากรอากาศ");   //119
        sci.add("มลพิษทางอากาศ");   //120

        List<String> social = new ArrayList<String>();
        social.add("จากอินเดีย...สู่สุโขทัย"); //101/index.php#.VOqLuS7luUk
        social.add("พระพุทธศาสนาในสมัยรัตนโกสินทร์"); //102
        social.add("วันมาฆบูชา โอวาทปาฏิโมกข์"); //103
        social.add("วันสำคัญสากล"); //104
        social.add("วัฒนธรรมของเราเหมือนหรือต่างกัน"); //105  //********BREAK VDO**********
        social.add("สิทธิและเสรีภาพของฉัน"); //106
        social.add("อำนาจอธิปไตยเป็นของใคร"); //107
        social.add("เศรษฐศาสตร์น่ารู้"); //108
        social.add("มารู้จักสถาบันการเงิน"); //109
        social.add("สถาบันการเงินที่ไม่ใช่ธนาคาร"); //110
        social.add("การนับและเทียบศักราช"); //111
        social.add("เยือนอาณาจักรโบราณในดินแดนกลาง-เหนือ"); //112
        social.add("เยือนอาณาจักรโบราณในดินแดนอีสาน-ใต้"); //113
        social.add("ตะลุยภาคเหนือและภาคกลาง"); //114
        social.add("ตะลุยภาคตะวันออกเฉียงเหนือและภาคตะวันออก"); //115
        social.add("ตะลุยภาคตะวันตกและภาคใต้"); //116
        social.add("มหัศจรรย์แดนเอเชีย"); //117
        social.add("รู้รอบเอเชีย"); //118
        social.add("พิชิตแดนจิงโจ้และหมู่เกาะปะการัง"); //119
        social.add("รู้รอบออสเตรเลียและโอเชียเนีย"); //120

       // List<String> bj = new ArrayList<String>();
        /*
        bj.add("การแต่งกายให้เหมาะสม"); //101
        bj.add("การใช้ของใช้ส่วนตัว"); //102
        bj.add("การกวาดบ้าน"); //201
        bj.add("การจัดเตรียมผักและผลไม้"); //202
        bj.add("การทำงานเพื่อช่วยเหลือครอบครัว การปัด กวาด เช็ด ถู บ้านเรือน"); //301
        bj.add("การทำงานเพื่อช่วยเหลือครอบครัว การกรอกน้ำใส่ขวด"); //302
        bj.add("รู้จักของใช้ส่วนตัว"); //401
        bj.add("การจัดเก็บสิ่งของเครื่องใช้"); //402
        bj.add("โท เรียนรู้การทำความสะอาดบ้าน"); //501
        bj.add("การจัดการในการทำงาน"); //601
        bj.add("การเลี้ยงปลาสวยงาม"); //607
    */

        listDataChild.put(listDataHeader.get(0), thai); // Header, Child data
        listDataChild.put(listDataHeader.get(1), math );
        listDataChild.put(listDataHeader.get(2), eng );
        listDataChild.put(listDataHeader.get(3), sci );
        listDataChild.put(listDataHeader.get(4), social );
       // listDataChild.put(listDataHeader.get(5), bj ); //การงารนและอาชีพ


    }

}



