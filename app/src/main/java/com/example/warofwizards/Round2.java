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

import static com.example.warofwizards.Round1.result;
import static com.example.warofwizards.Round1.result1;

public class Round2 extends AppCompatActivity implements View.OnClickListener {
    Button flybtn, rockbtn, fightbtn, quit, nextRound;
    ImageView imageThrowLeft, charleft, imageThrowRight, charright, flyimgthrowleft, flyimgthrowright, rockimgthrowleft, rockimgthrowright;
    TextView display, scoredisplay;
    int player, comp, a = 1, score = 0, score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_round2);
        flybtn = (Button) findViewById(R.id.btnFly);
        rockbtn = (Button) findViewById(R.id.btnRock);
        fightbtn = (Button) findViewById(R.id.btnFight);
        quit = (Button)findViewById(R.id.quit);
        nextRound = (Button)findViewById(R.id.round3);
        imageThrowLeft = (ImageView) findViewById(R.id.round2throwleft);
        flyimgthrowleft = (ImageView)findViewById(R.id.round2flythrowleft);
        flyimgthrowright = (ImageView)findViewById(R.id.round2flythrowright);
        rockimgthrowright = (ImageView)findViewById(R.id.round2rockthrowright);
        rockimgthrowleft = (ImageView)findViewById(R.id.round2rockthrowleft);
        imageThrowRight = (ImageView)findViewById(R.id.round2throwright);
        charleft = (ImageView) findViewById(R.id.round2charleft);
        charright = (ImageView)findViewById(R.id.round2charright);
        display = (TextView)findViewById(R.id.display);
        scoredisplay = (TextView)findViewById(R.id.score);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextRound.setEnabled(false);

        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round2.this, Round3.class);
                startActivity(intent);
            }
        });


        flybtn.setOnClickListener(this);
        rockbtn.setOnClickListener(this);
        fightbtn.setOnClickListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {
        if(a == 4){
            flybtn.setTextColor(Color.BLACK);
            rockbtn.setTextColor(Color.BLACK);
            fightbtn.setTextColor(Color.BLACK);
            flybtn.setEnabled(false);
            rockbtn.setEnabled(false);
            fightbtn.setEnabled(false);
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
                case R.id.btnFly:
                    imageThrowLeft.setImageResource(R.drawable.transparent);
                    rockimgthrowright.setImageResource(R.drawable.transparent);
                    charleft.setImageResource(R.drawable.flychar);
                    flyimgthrowleft.setImageResource(R.drawable.flythrowleft);
                    AnimationDrawable flyChar = (AnimationDrawable) charleft.getDrawable();
                    AnimationDrawable fThrowLeft = (AnimationDrawable) flyimgthrowleft.getDrawable();
                    Animation fLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    fLeftToRight.setDuration(1000);
                    fLeftToRight.setFillAfter(false);
                    flyimgthrowleft.startAnimation(fLeftToRight);
                    flyimgthrowleft.setVisibility(0);
                    flyChar.start();
                    fThrowLeft.start();

                    player = 1;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 1 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 1 && comp == 2) {
                            flyimgthrowright.setImageResource(R.drawable.transparent);
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.rockcharright);
                            rockimgthrowleft.setImageResource(R.drawable.rockthrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) rockimgthrowright.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,0,-200,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            rockimgthrowleft.startAnimation(fRightToLeft);
                            rockimgthrowleft.setVisibility(0);
                            compWaterChar.start();
//                            compThrowWater.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.flycharimgleft2);
                            display.setText("You Choose Fly\nComp Choose Rock\nComp Win");
                        } else if (player == 1 && comp == 3) {
                            flyimgthrowright.setImageResource(R.drawable.transparent);
                            rockimgthrowleft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.fightcharright);
                            imageThrowRight.setImageResource(R.drawable.fightthrow1);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
//                            compThrowLeaf.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.fightcharimgright2);
                            display.setText("You Choose Fly\nComp Choose Fight\nYou Win");
                        } else if (player == 1 && comp == 1) {
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            rockimgthrowleft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.flycharright);
                            flyimgthrowright.setImageResource(R.drawable.flythrowright);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowFire = (AnimationDrawable) flyimgthrowright.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            flyimgthrowright.startAnimation(fRightToLeft);
                            flyimgthrowright.setVisibility(0);
                            compFireChar.start();
                            compThrowFire.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Fly\nComp Choose Fly\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnRock:
                    flyimgthrowright.setImageResource(R.drawable.transparent);
                    imageThrowLeft.setImageResource(R.drawable.transparent);
                    flyimgthrowleft.setImageResource(R.drawable.transparent);
                    charleft.setImageResource(R.drawable.rockchar);
                    rockimgthrowright.setImageResource(R.drawable.rockthrow1);
                    AnimationDrawable waterChar = (AnimationDrawable) charleft.getDrawable();
//                    AnimationDrawable wThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation wLeftToRight = new TranslateAnimation(0, 0, -200, 0);
                    wLeftToRight.setDuration(1000);
                    wLeftToRight.setFillAfter(false);
                    rockimgthrowright.startAnimation(wLeftToRight);
                    rockimgthrowright.setVisibility(0);
                    waterChar.start();
//                    wThrowLeft.start();

                    player = 2;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 2 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 2 && comp == 1) {
                            rockimgthrowleft.setImageResource(R.drawable.transparent);
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            imageThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.flycharright);
                            flyimgthrowright.setImageResource(R.drawable.flythrowright);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            flyimgthrowright.startAnimation(fRightToLeft);
                            flyimgthrowright.setVisibility(0);
                            compFireChar.start();
//                            compThrowFire.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.flycharimgright2);
                            display.setText("You Choose Rock\nComp Choose Fly\nYou Win");
                        } else if (player == 2 && comp == 3) {
                            rockimgthrowleft.setImageResource(R.drawable.transparent);
                            imageThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.fightcharright);
                            imageThrowRight.setImageResource(R.drawable.fightthrow1);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
//                            compThrowLeaf.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.rockcharimgleft2);
                            display.setText("You Choose Rock\nComp Choose Fight\nComp Win");
                        } else if (player == 2 && comp == 2) {
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.rockcharright);
                            rockimgthrowleft.setImageResource(R.drawable.rockthrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation wRightToLeft = new TranslateAnimation(0,0,-200,0);
                            wRightToLeft.setFillAfter(false);
                            wRightToLeft.setDuration(1000);
                            rockimgthrowleft.startAnimation(wRightToLeft);
                            rockimgthrowleft.setVisibility(0);
                            compWaterChar.start();
//                            compThrowWater.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Rock\nComp Choose Rock\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnFight:
                    flyimgthrowright.setImageResource(R.drawable.transparent);
                    rockimgthrowleft.setImageResource(R.drawable.transparent);
                    rockimgthrowright.setImageResource(R.drawable.transparent);
                    flyimgthrowleft.setImageResource(R.drawable.transparent);
                    charleft.setImageResource(R.drawable.fightchar);
                    imageThrowLeft.setImageResource(R.drawable.fightthrow2);
                    AnimationDrawable leafChar = (AnimationDrawable) charleft.getDrawable();
//                    AnimationDrawable lThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation lLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    lLeftToRight.setDuration(1000);
                    lLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(lLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    leafChar.start();
//                    lThrowLeft.start();

                    player = 3;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 3 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 3 && comp == 1) {
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.flycharright);
                            flyimgthrowright.setImageResource(R.drawable.flythrowright);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowFire = (AnimationDrawable) flyimgthrowright.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            flyimgthrowright.startAnimation(fRightToLeft);
                            flyimgthrowright.setVisibility(0);
                            compFireChar.start();
                            compThrowFire.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.fightcharimgleft2);
                            display.setText("You Choose Fight\nComp Choose Fly\nComp Win");
                        } else if (player == 3 && comp == 2) {
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.rockcharright);
                            rockimgthrowleft.setImageResource(R.drawable.rockthrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation wRightToLeft = new TranslateAnimation(0,0,-200,0);
                            wRightToLeft.setFillAfter(false);
                            wRightToLeft.setDuration(1000);
                            rockimgthrowleft.startAnimation(wRightToLeft);
                            rockimgthrowleft.setVisibility(0);
                            compWaterChar.start();
//                            compThrowWater.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.rockcharimgright2);
                            display.setText("You Choose Fight\nComp Choose Rock\nYou Win");
                        } else if (player == 3 && comp == 3) {
                            charright.setImageResource(R.drawable.fightcharright);
                            imageThrowRight.setImageResource(R.drawable.fightthrow1);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
//                            compThrowLeaf.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Fight\nComp Choose Fight\nMatch Tied");
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