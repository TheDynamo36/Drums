package pro.drums;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button kick;
    Button clap;
    Button snare;
    Button tom;
    Button cymbal;
    Button hithat;

    private final int SIMULTANEOUS_SOUNDS = 6;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float PLAY_RATE = 1.0f;

    private int kickId;
    private int snareId;
    private int tomId;
    private int hithatId;
    private int clapId;
    private int cymbalId;
    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kick = findViewById(R.id.kick);
        clap = findViewById(R.id.clap);
        snare = findViewById(R.id.snare);
        tom = findViewById(R.id.tom);
        cymbal = findViewById(R.id.cymbal);
        hithat = findViewById(R.id.hithat);


        mSoundPool = new SoundPool(SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);
        kickId = mSoundPool.load(getApplicationContext(),R.raw.kick,1);
        snareId = mSoundPool.load(getApplicationContext(),R.raw.snare,1);
        tomId = mSoundPool.load(getApplicationContext(),R.raw.tom,1);
        hithatId = mSoundPool.load(getApplicationContext(),R.raw.hithat,1);
        clapId = mSoundPool.load(getApplicationContext(),R.raw.clap,1);
        cymbalId = mSoundPool.load(getApplicationContext(),R.raw.cymbal,1);
    }
    public void playKick(View view){
        mSoundPool.play(kickId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PLAY_RATE);
    }
    public void playSnare(View view){
        mSoundPool.play(snareId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PLAY_RATE);
    }
    public void playTom(View view){
        mSoundPool.play(tomId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PLAY_RATE);
    }
    public void playHithat(View view){
        mSoundPool.play(hithatId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PLAY_RATE);
    }
    public void playClap(View view){
        mSoundPool.play(clapId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PLAY_RATE);
    }
    public void playCymbal(View view){
        mSoundPool.play(cymbalId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PLAY_RATE);
    }
}
