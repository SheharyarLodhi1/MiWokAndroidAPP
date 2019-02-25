package com.next.sheharyar.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MusicPlayerActivity extends AppCompatActivity {

    Button playMsc, pauseMsc;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        playMsc = (Button)findViewById(R.id.playMusic);
        pauseMsc = (Button)findViewById(R.id.pauseMusic);

        playMsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodToPlayMusic();
            }
        });

        pauseMsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodToPauseMusic();
            }
        });
    }

    private void methodToPlayMusic() {

        Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
    }

    private void methodToPauseMusic() {

        Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
    }
}
