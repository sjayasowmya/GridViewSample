package com.example.jayasowmya.gridviewsample;


import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    GridView gv;
    Context context;
    ArrayList prgmName;
    public static String [] prgmNameList={"Delhi Dare Devils","Enrique","Illayaraja","Kolkata Knight Riders","RajniKanth","Royal Challengers Bengaluru","A.R.Rehman","SunRisers Hyderabad"};
    public static int [] prgmImages={R.drawable.dd,R.drawable.enrique,R.drawable.illayraja,R.drawable.kkr,R.drawable.rajnikanth,R.drawable.rcb,R.drawable.rehman,R.drawable.srh};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}