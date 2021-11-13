package com.example.warofwizards;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Round1 extends AppCompatActivity implements View.OnClickListener {
    Button firebtn, waterbtn, leafbtn, quit, nextRound;
    ImageView imageThrowLeft, fireCh, imageThrowRight, charright;
    TextView display, scoredisplay;
    int player, comp, a = 1, score = 0, score1 = 0;
    public static int result = 0, result1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_round1);
        firebtn = (Button) findViewById(R.id.btnFire);
        waterbtn = (Button) findViewById(R.id.btnWater);
        leafbtn = (Button) findViewById(R.id.btnLeaf);
        quit = (Button)findViewById(R.id.quit);
        nextRound = (Button)findViewById(R.id.round2);
        imageThrowLeft = (ImageView) findViewById(R.id.round1throwleft);
        imageThrowRight = (ImageView)findViewById(R.id.round1throwright);
        fireCh = (ImageView) findViewById(R.id.round1charleft);
        charright = (ImageView)findViewById(R.id.round1charright);
        display = (TextView)findViewById(R.id.display);
        scoredisplay = (TextView)findViewById(R.id.score);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextRound.setEnabled(false);

        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round1.this, Round2.class);
                startActivity(intent);
            }
        });


        firebtn.setOnClickListener(this);
        waterbtn.setOnClickListener(this);
        leafbtn.setOnClickListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {
        if(a == 4){
            firebtn.setTextColor(Color.BLACK);
            waterbtn.setTextColor(Color.BLACK);
            leafbtn.setTextColor(Color.BLACK);
            firebtn.setEnabled(false);
            waterbtn.setEnabled(false);
            leafbtn.setEnabled(false);
            nextRound.setTextColor(Color.GREEN);
            nextRound.setEnabled(true);
            if(score > score1){
                result = result + 1;
            }else if(score == score1){

            }else{
                result1 = result1 + 1;
            }
        }else{
            switch (v.getId()){
                case R.id.btnFire:
                    fireCh.setImageResource(R.drawable.firechar);
                    imageThrowLeft.setImageResource(R.drawable.firethrowleft);
                    AnimationDrawable fireChar = (AnimationDrawable) fireCh.getDrawable();
                    AnimationDrawable fThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation fLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    fLeftToRight.setDuration(1000);
                    fLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(fLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    fireChar.start();
                    fThrowLeft.start();

                    player = 1;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 1 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 1 && comp == 2) {
                            charright.setImageResource(R.drawable.watercharright);
                            imageThrowRight.setImageResource(R.drawable.waterthrowright);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
                            compThrowWater.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            fireCh.setImageResource(R.drawable.firecharimgleft2);
                            display.setText("You Choose Fire\nComp Choose Water\nComp Win");
                        } else if (player == 1 && comp == 3) {
                            charright.setImageResource(R.drawable.leafcharright);
                            imageThrowRight.setImageResource(R.drawable.leafthrowright);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
                            compThrowLeaf.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.leafcharimgright2);
                            display.setText("You Choose Fire\nComp Choose Leaf\nYou Win");
                        } else if (player == 1 && comp == 1) {
                            charright.setImageResource(R.drawable.firecharright);
                            imageThrowRight.setImageResource(R.drawable.firethrowright);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compFireChar.start();
                            compThrowFire.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Fire\nComp Choose Fire\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnWater:
                    fireCh.setImageResource(R.drawable.waterchar);
                    imageThrowLeft.setImageResource(R.drawable.waterthrowleft);
                    AnimationDrawable waterChar = (AnimationDrawable) fireCh.getDrawable();
                    AnimationDrawable wThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation wLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    wLeftToRight.setDuration(1000);
                    wLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(wLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    waterChar.start();
                    wThrowLeft.start();

                    player = 2;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 2 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 2 && comp == 1) {
                            charright.setImageResource(R.drawable.firecharright);
                            imageThrowRight.setImageResource(R.drawable.firethrowright);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compFireChar.start();
                            compThrowFire.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.firecharimgright2);
                            display.setText("You Choose Water\nComp Choose Fire\nYou Win");
                        } else if (player == 2 && comp == 3) {
                            charright.setImageResource(R.drawable.leafcharright);
                            imageThrowRight.setImageResource(R.drawable.leafthrowright);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
                            compThrowLeaf.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            fireCh.setImageResource(R.drawable.watercharimgleft2);
                            display.setText("You Choose Water\nComp Choose Leaf\nComp Win");
                        } else if (player == 2 && comp == 2) {
                            charright.setImageResource(R.drawable.watercharright);
                            imageThrowRight.setImageResource(R.drawable.waterthrowright);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation wRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            wRightToLeft.setFillAfter(false);
                            wRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(wRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
                            compThrowWater.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Water\nComp Choose Water\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnLeaf:
                    fireCh.setImageResource(R.drawable.leafchar);
                    imageThrowLeft.setImageResource(R.drawable.leafthrowleft);
                    AnimationDrawable leafChar = (AnimationDrawable) fireCh.getDrawable();
                    AnimationDrawable lThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation lLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    lLeftToRight.setDuration(1000);
                    lLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(lLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    leafChar.start();
                    lThrowLeft.start();

                    player = 3;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 3 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 3 && comp == 1) {
                            charright.setImageResource(R.drawable.firecharright);
                            imageThrowRight.setImageResource(R.drawable.firethrowright);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compFireChar.start();
                            compThrowFire.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            fireCh.setImageResource(R.drawable.leafcharimgleft2);
                            display.setText("You Choose Leaf\nComp Choose Fire\nComp Win");
                        } else if (player == 3 && comp == 2) {
                            charright.setImageResource(R.drawable.watercharright);
                            imageThrowRight.setImageResource(R.drawable.waterthrowright);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
                            compThrowWater.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.watercharimgright2);
                            display.setText("You Choose Leaf\nComp Choose Water\nYou Win");
                        } else if (player == 3 && comp == 3) {
                            charright.setImageResource(R.drawable.leafcharright);
                            imageThrowRight.setImageResource(R.drawable.leafthrowright);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation wRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            wRightToLeft.setFillAfter(false);
                            wRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(wRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
                            compThrowLeaf.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Leaf\nComp Choose Leaf\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;
            }
        }
    }
}