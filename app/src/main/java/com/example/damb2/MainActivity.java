package com.example.damb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { TextView txt;Handler handlerUI = new Handler();
    public Button one;
    public Button two;
    public Button three ;
    public Button four ;
    public Button five;
    public Button six ;
    public Button seven ;
    MediaPlayer mp;
    Animation anim = null;
    boolean stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        stop=false;
        mp = MediaPlayer.create(this, R.raw.song1);
        one = (Button)this.findViewById(R.id.btn1);
        two = (Button)this.findViewById(R.id.btn2);
        three = (Button)this.findViewById(R.id.btn3);
        four = (Button)this.findViewById(R.id.btn4);
        five = (Button)this.findViewById(R.id.btn5);
        six = (Button)this.findViewById(R.id.btn6);
        seven = (Button)this.findViewById(R.id.btn7);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.action_1 :
                Star();
                break;
            case R.id.action_2:
                Star2();
                break;
            case R.id.action_3:
                Star3();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
        void Star(){
            if(mp.isPlaying()){mp.release();}
        mp = MediaPlayer.create(this, R.raw.song1);
        mp.start();

        final Animation finalAnim = anim;
        int tim=500;
        for(int i=0;i<=58;i++) {
         int n=1;
            Random random = new Random();
            n = random.nextInt(7 + 1);
            switch (n){
                case 1:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            one.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 2:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            two.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 3:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            three.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 4:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            four.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 5:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            five.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 6:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            six.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 7:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            seven.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                default:
                    handlerUI.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        four.startAnimation(finalAnim);
                    }
                }, tim);
                    tim += 500;
                    break;
            }
        }
            stop=false;
    }
        void Star2() {
            if(mp.isPlaying()){mp.release();}
        mp = MediaPlayer.create(this, R.raw.song2);
        stop=true;
        mp.start();
        stop=true;
        final Animation finalAnim = anim;
        int tim = 450, n = 1;
        for (int i = 0; i <= 46; i++) {
            final Random random = new Random();
            n = random.nextInt(7)+1;
            switch (n) {
                case 1:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            one.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 2:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            two.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 3:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            three.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 4:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            four.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 5:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            five.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 6:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            six.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                case 7:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            seven.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
                default:
                    handlerUI.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            four.startAnimation(finalAnim);
                        }
                    }, tim);
                    tim += 500;
                    break;
            }
        }
            stop=false;mp = MediaPlayer.create(this, R.raw.song1);
    }
    void Star3(){
        if(mp.isPlaying()){mp.release();}
        mp = MediaPlayer.create(this, R.raw.song1);
        mp = MediaPlayer.create(this, R.raw.song1);
        int t=500;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {two.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {four.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {three.performClick();} }, t);
        t+=500;

        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {two.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {five.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {four.performClick();} }, t);
        t+=500;

        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {one.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {seven.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {six.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {four.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {four.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {three.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {two.performClick();} }, t);
        t+=500;

        handlerUI.postDelayed(new Runnable() { @Override public void run() {six.performClick();} }, t);
        handlerUI.postDelayed(new Runnable() { @Override public void run() {seven.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {seven.performClick();} }, t);
        handlerUI.postDelayed(new Runnable() { @Override public void run() {six.performClick();} }, t);
        t+=300;

        handlerUI.postDelayed(new Runnable() { @Override public void run() {six.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {four.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {five.performClick();} }, t);
        t+=300;
        handlerUI.postDelayed(new Runnable() { @Override public void run() {four.performClick();} }, t);
        t+=300;
        stop=false;mp = MediaPlayer.create(this, R.raw.song1);
    }

    @Override
    public void onClick(View v) {

        mp = MediaPlayer.create(this,R.raw.do1);
            switch(v.getId())  {
                case  R.id.btn1:
                    mp = MediaPlayer.create(this,R.raw.do1);
                    mp.start();
                    one.startAnimation(anim);
                    final MediaPlayer finalMp = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                case  R.id.btn2:
                    mp = MediaPlayer.create(this,R.raw.re);
                    mp.start();
                    two.startAnimation(anim);
                    final MediaPlayer finalMp1 = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp1.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                case  R.id.btn3:
                    mp = MediaPlayer.create(this,R.raw.mi);
                    mp.start();
                    three.startAnimation(anim);
                    final MediaPlayer finalMp2 = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp2.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                case  R.id.btn4:
                    mp = MediaPlayer.create(this,R.raw.fa);
                    mp.start();
                    four.startAnimation(anim);
                    final MediaPlayer finalMp3 = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp3.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                case  R.id.btn5:
                    mp = MediaPlayer.create(this,R.raw.so);
                    mp.start();
                    five.startAnimation(anim);
                    final MediaPlayer finalMp4 = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp4.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                case  R.id.btn6:
                    mp = MediaPlayer.create(this,R.raw.lia);
                    mp.start();
                    six.startAnimation(anim);
                    final MediaPlayer finalMp5 = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp5.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                case  R.id.btn7:
                    mp = MediaPlayer.create(this,R.raw.si);
                    mp.start();
                    seven.startAnimation(anim);
                    final MediaPlayer finalMp6 = mp;
                    handlerUI.postDelayed(new Runnable() { @Override public void run() { finalMp6.release(); } }, 500);
                    mp = MediaPlayer.create(this,R.raw.do1);
                    break;
                default:mp = MediaPlayer.create(this, R.raw.song1); break;
            }
        }
}