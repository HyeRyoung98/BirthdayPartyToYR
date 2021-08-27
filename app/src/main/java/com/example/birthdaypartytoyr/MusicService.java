package com.example.birthdaypartytoyr;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {
    MediaPlayer mp;
    public IBinder onBind(Intent intent){
        return null;
    }

    public void onCreate(){
        super.onCreate();
    }
    public void onDestroy(){
        mp.stop();
        super.onDestroy();
    }
    public int onStartCommand(Intent intent, int flags, int startId){
        mp = MediaPlayer.create(this, R.raw.song1);
        mp.setLooping(true);
        mp.start();
        return super.onStartCommand(intent, flags, startId);
    }


}
