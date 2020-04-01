package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2;
    private TextView tx1;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);

        mediaPlayer = MediaPlayer.create(this, R.raw.skillet);
    }

    public void play(View view) {
        mediaPlayer.start();
        tx1 = (TextView)findViewById(R.id.textView);
        tx1.setText("R A I S E !  PLAYING");
        Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
    }

    public void pause(View view) {
        mediaPlayer.pause();
        tx1.setText("R A I S E !  PAUSED");
        Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
    }
}
