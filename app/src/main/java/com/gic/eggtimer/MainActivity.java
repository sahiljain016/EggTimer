package com.gic.eggtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar tsb;


    public void eggChange(View view){
        ImageView e2=(ImageView) findViewById(R.id.egg2) ;
        ImageView e3=(ImageView) findViewById(R.id.egg3) ;
        ImageView e4=(ImageView) findViewById(R.id.egg4) ;
        ImageView e5=(ImageView) findViewById(R.id.egg5) ;
        ImageView e6=(ImageView) findViewById(R.id.egg6) ;
        ImageView e7=(ImageView) findViewById(R.id.egg7) ;
        ImageView el=(ImageView) findViewById(R.id.eggl) ;
        ImageView er=(ImageView) findViewById(R.id.eggr) ;
        ImageView ela=(ImageView) findViewById(R.id.eggla) ;
        ImageView era=(ImageView) findViewById(R.id.eggra) ;
        int nos;
    nos = tsb.getProgress();

    if(nos == 10){

        e2.animate().alpha(0).setDuration(20).setStartDelay(1000);
        el.animate().alpha(0).setDuration(20).setStartDelay(2000);
        er.animate().alpha(0).setDuration(20).setStartDelay(3000);
        ela.animate().alpha(0).setDuration(20).setStartDelay(4000);
       era.animate().alpha(0).setDuration(20).setStartDelay(5000);
        e3.animate().alpha(0).setDuration(20).setStartDelay(6000);
       e4.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(7000);
        e5.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(8000);
        e6.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(9000);
        e7.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(10000);
    }
    else if(nos == 20){
        e2.animate().alpha(0).setDuration(20).setStartDelay(2000);
        el.animate().alpha(0).setDuration(20).setStartDelay(4000);
        er.animate().alpha(0).setDuration(20).setStartDelay(6000);
        ela.animate().alpha(0).setDuration(20).setStartDelay(8000);
        era.animate().alpha(0).setDuration(20).setStartDelay(10000);
        e3.animate().alpha(0).setDuration(20).setStartDelay(12000);
        e4.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(14000);
        e5.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(16000);
        e6.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(18000);
        e7.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(20000);

    }
    else if(nos == 30){
        e2.animate().alpha(0).setDuration(20).setStartDelay(3000);
        el.animate().alpha(0).setDuration(20).setStartDelay(6000);
        er.animate().alpha(0).setDuration(20).setStartDelay(9000);
        ela.animate().alpha(0).setDuration(20).setStartDelay(12000);
        era.animate().alpha(0).setDuration(20).setStartDelay(15000);
        e3.animate().alpha(0).setDuration(20).setStartDelay(18000);
        e4.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(21000);
        e5.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(24000);
        e6.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(27000);
        e7.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(30000);

    }
    else if(nos == 40){
        e2.animate().alpha(0).setDuration(20).setStartDelay(4000);
        el.animate().alpha(0).setDuration(20).setStartDelay(8000);
        er.animate().alpha(0).setDuration(20).setStartDelay(12000);
        ela.animate().alpha(0).setDuration(20).setStartDelay(16000);
        era.animate().alpha(0).setDuration(20).setStartDelay(20000);
        e3.animate().alpha(0).setDuration(20).setStartDelay(24000);
        e4.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(28000);
        e5.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(32000);
        e6.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(36000);
        e7.animate().alpha(0).translationYBy(4000).setDuration(20).setStartDelay(40000);

    }
    new CountDownTimer(tsb.getProgress()*1000 + 100, 1000){

        @Override
        public void onTick(long l) {


            updateTimer((int) l/1000);
        }

        @Override
        public void onFinish() {


            ImageView e9=(ImageView) findViewById(R.id.egg9) ;
            ImageView e8=(ImageView) findViewById(R.id.egg8) ;
            e8.animate().translationYBy(2000f).alpha(1).setDuration(700);
            e9.animate().alpha(1).translationYBy(2000f).setDuration(700);

            MediaPlayer au1=MediaPlayer.create(MainActivity.this, R.raw.blast);
            au1.start();

        }
    }.start();

}

public void updateTimer(int secondsleft){

    final TextView timer= (TextView) findViewById(R.id.timer);
    String second = Integer.toString(secondsleft);
    timer.setText(second);
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView e8=(ImageView) findViewById(R.id.egg8) ;
        ImageView e9=(ImageView) findViewById(R.id.egg9) ;
        e8.setY(-2000f);
        e9.setY(-2000f);
        tsb = (SeekBar) findViewById(R.id.seekBarTime);



        tsb.setMin(10);



        tsb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                updateTimer(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBar tsb = (SeekBar) findViewById(R.id.seekBarTime);
tsb.setProgress(30);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}