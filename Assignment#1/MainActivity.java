Package com.example.lifecyclebasic;


Import android.media.MediaPlayer;

Import android.os.Bundle;

Import androidx.appcompat.app.AppCompatActivity;


Public class MainActivity extends AppCompatActivity {


MediaPlayer music;


@Override

Protected void onCreate(Bundle savedInstanceState) {

Super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);



Music = MediaPlayer.create(this, R.raw.sample_music);

}


@Override

Protected void onResume() {

Super.onResume();

Music.start();

}


@Override

Protected void onPause() {

Super.onPause();

Music.pause();

}


@Override

Protected void onDestroy() {

Super.onDestroy();

Music.release();

Music = null;

}

}
