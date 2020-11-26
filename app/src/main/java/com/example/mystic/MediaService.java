package com.example.mystic;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.media.MediaPlayer;

public class MediaService extends Service {
    MediaPlayer ambientMediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        ambientMediaPlayer = MediaPlayer.create(this, R.raw.music);
        ambientMediaPlayer.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        ambientMediaPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        ambientMediaPlayer.stop();
    }
}