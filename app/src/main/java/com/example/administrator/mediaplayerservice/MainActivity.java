package com.example.administrator.mediaplayerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"停止播放");
        menu.add(0,2,0,"开始播放");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent in=new Intent(this,playservice.class);
        switch (item.getItemId()){
            case 1:startService(in);break;
            case 2:stopService(in);break;
        }
        return super.onOptionsItemSelected(item);
    }
}
