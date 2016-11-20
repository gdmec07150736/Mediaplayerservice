package com.example.administrator.mediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


public class playservice extends Service{
    MediaPlayer mplayer;
    public playservice(){
    }
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mplayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mplayer=MediaPlayer.create(this,R.raw.exodus);
        mplayer.setLooping(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mplayer.stop();
        mplayer.release();
    }
}
