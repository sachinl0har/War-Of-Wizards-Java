package com.example.warofwizards;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
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

public class Round4 extends AppCompatActivity implements View.OnClickListener {
    Button darkbtn, fairybtn, poisenbtn, psybtn, quit, nextRound;
    ImageView imageThrowLeft, charleft, imageThrowRight, charright;
    TextView display, scoredisplay;
    int player, comp, a = 1, score = 0, score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_round4);
        darkbtn = (Button) findViewById(R.id.btnDark);
        fairybtn = (Button) findViewById(R.id.btnFairy);
        poisenbtn = (Button) findViewById(R.id.btnPoisen);
        psybtn = (Button) findViewById(R.id.btnPsychic);
        quit = (Button)findViewById(R.id.quit);
        nextRound = (Button)findViewById(R.id.round5);
        imageThrowLeft = (ImageView) findViewById(R.id.round4throwleft);
        imageThrowRight = (ImageView)findViewById(R.id.round4throwright);
        charleft = (ImageView) findViewById(R.id.round4charleft);
        charright = (ImageView)findViewById(R.id.round4charright);
        display = (TextView)findViewById(R.id.display);
        scoredisplay = (TextView)findViewById(R.id.score);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round4.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextRound.setEnabled(false);

        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round4.this, Result.class);
                startActivity(intent);
            }
        });


        darkbtn.setOnClickListener(this);
        fairybtn.setOnClickListener(this);
        poisenbtn.setOnClickListener(this);
        psybtn.setOnClickListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {
        if(a == 4){
            darkbtn.setTextColor(Color.BLACK);
            fairybtn.setTextColor(Color.BLACK);
            poisenbtn.setTextColor(Color.BLACK);
            psybtn.setTextColor(Color.BLACK);
            darkbtn.setEnabled(false);
            fairybtn.setEnabled(false);
            poisenbtn.setEnabled(false);
            psybtn.setEnabled(false);
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
                case R.id.btnDark:
                    charleft.setImageResource(R.drawable.darkchar);
                    imageThrowLeft.setImageResource(R.drawable.darkthroww);
                    AnimationDrawable fireChar = (AnimationDrawable) charleft.getDrawable();
                    AnimationDrawable fThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation fLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    fLeftToRight.setDuration(1000);
                    fLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(fLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    fireChar.start();
                    fThrowLeft.start();

                    player = 1;
                    comp = (int) (Math.random() * (4 - 1 + 1) + 1);
                    if (player == 1 && comp == 1 || comp == 2 || comp == 3 || comp == 4) {
                        if (player == 1 && comp == 2) {
                            charright.setImageResource(R.drawable.fairycharright);
                            imageThrowRight.setImageResource(R.drawable.fairythroww);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
                            compThrowWater.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.fairycharimgright2);
                            display.setText("You Choose Dark\nComp Choose Fairy\nYou Win");
                        } else if (player == 1 && comp == 3) {
                            charright.setImageResource(R.drawable.poisencharright);
                            imageThrowRight.setImageResource(R.drawable.poisenthroww);
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
                            charright.setImageResource(R.drawable.darkcharimgright2);
                            display.setText("You Choose Dark\nComp Choose Poisen\nComp Win");
                        }else if (player == 1 && comp == 4) {
                            charright.setImageResource(R.drawable.psycharright);
                            imageThrowRight.setImageResource(R.drawable.psythrowright);
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
                            charright.setImageResource(R.drawable.darkcharimgright2);
                            display.setText("You Choose Dark\nComp Choose Psychic\nComp Win");
                        } else if (player == 1 && comp == 1) {
                            charright.setImageResource(R.drawable.darkcharright);
                            imageThrowRight.setImageResource(R.drawable.darkthroww);
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
                            display.setText("You Choose Dark\nComp Choose Dark\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnFairy:
                    charleft.setImageResource(R.drawable.fairychar);
                    imageThrowLeft.setImageResource(R.drawable.fairythroww);
                    AnimationDrawable waterChar = (AnimationDrawable) charleft.getDrawable();
                    AnimationDrawable wThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation wLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    wLeftToRight.setDuration(1000);
                    wLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(wLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    waterChar.start();
                    wThrowLeft.start();

                    player = 2;
                    comp = (int) (Math.random() * (4 - 1 + 1) + 1);
                    if (player == 2 && comp == 1 || comp == 2 || comp == 3 || comp == 4) {
                        if (player == 2 && comp == 1) {
                            charright.setImageResource(R.drawable.darkcharright);
                            imageThrowRight.setImageResource(R.drawable.darkthroww);
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
                            charleft.setImageResource(R.drawable.fairycharimgleft2);
                            display.setText("You Choose Fairy\nComp Choose Dark\nComp Win");
                        } else if (player == 2 && comp == 3) {
                            charright.setImageResource(R.drawable.poisencharright);
                            imageThrowRight.setImageResource(R.drawable.poisenthroww);
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
                            charright.setImageResource(R.drawable.poisencharimgright2);
                            display.setText("You Choose Fairy\nComp Choose Poisen\nYou Win");
                        }else if (player == 2 && comp == 4) {
                            charright.setImageResource(R.drawable.psycharright);
                            imageThrowRight.setImageResource(R.drawable.psythrowright);
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
                            charright.setImageResource(R.drawable.psycharimgright3);
                            display.setText("You Choose Fairy\nComp Choose Psychic\nYou Win");
                        } else if (player == 2 && comp == 2) {
                            charright.setImageResource(R.drawable.fairycharright);
                            imageThrowRight.setImageResource(R.drawable.fairythroww);
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
                            display.setText("You Choose Fairy\nComp Choose Fairy\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnPoisen:
                    charleft.setImageResource(R.drawable.poisenchar);
                    imageThrowLeft.setImageResource(R.drawable.poisenthroww);
                    AnimationDrawable leafChar = (AnimationDrawable) charleft.getDrawable();
                    AnimationDrawable lThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation lLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    lLeftToRight.setDuration(1000);
                    lLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(lLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    leafChar.start();
                    lThrowLeft.start();

                    player = 3;
                    comp = (int) (Math.random() * (4 - 1 + 1) + 1);
                    if (player == 3 && comp == 1 || comp == 2 || comp == 3 || comp == 4) {
                        if (player == 3 && comp == 1) {
                            charright.setImageResource(R.drawable.darkcharright);
                            imageThrowRight.setImageResource(R.drawable.darkthroww);
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
                            charright.setImageResource(R.drawable.darkcharimgright2);
                            display.setText("You Choose Poisen\nComp Choose Dark\nYou Win");
                        } else if (player == 3 && comp == 2) {
                            charright.setImageResource(R.drawable.fairycharright);
                            imageThrowRight.setImageResource(R.drawable.fairythroww);
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
                            charleft.setImageResource(R.drawable.poisencharimgleft2);
                            display.setText("You Choose Poisen\nComp Choose Fairy\nComp Win");
                        }else if (player == 3 && comp == 4) {
                            charright.setImageResource(R.drawable.psycharright);
                            imageThrowRight.setImageResource(R.drawable.psythrowright);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
                            compThrowWater.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.psycharimgright3);
                            display.setText("You Choose Poisen\nComp Choose Psychic\nYou Win");
                        } else if (player == 3 && comp == 3) {
                            charright.setImageResource(R.drawable.poisencharright);
                            imageThrowRight.setImageResource(R.drawable.poisenthroww);
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
                            display.setText("You Choose Poisen\nComp Choose Poisen\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnPsychic:
                    charleft.setImageResource(R.drawable.psychar);
                    imageThrowLeft.setImageResource(R.drawable.psythrowleft);
                    AnimationDrawable pleafChar = (AnimationDrawable) charleft.getDrawable();
                    AnimationDrawable plThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation plLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    plLeftToRight.setDuration(1000);
                    plLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(plLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    pleafChar.start();
                    plThrowLeft.start();

                    player = 4;
                    comp = (int) (Math.random() * (4 - 1 + 1) + 1);
                    if (player == 4 && comp == 1 || comp == 2 || comp == 3 || comp == 4) {
                        if (player == 4 && comp == 1) {
                            charright.setImageResource(R.drawable.darkcharright);
                            imageThrowRight.setImageResource(R.drawable.darkthroww);
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
                            charright.setImageResource(R.drawable.darkcharimgright2);
                            display.setText("You Choose Psychic\nComp Choose Dark\nYou Win");
                        } else if (player == 4 && comp == 2) {
                            charright.setImageResource(R.drawable.fairycharright);
                            imageThrowRight.setImageResource(R.drawable.fairythroww);
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
                            charleft.setImageResource(R.drawable.psycharimgleft3);
                            display.setText("You Choose Psychic\nComp Choose Fairy\nComp Win");
                        }else if (player == 4 && comp == 3) {
                            charright.setImageResource(R.drawable.poisencharright);
                            imageThrowRight.setImageResource(R.drawable.poisenthroww);
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
                            charleft.setImageResource(R.drawable.psycharimgleft3);
                            display.setText("You Choose Psychic\nComp Choose Poisen\nComp Win");
                        } else if (player == 4 && comp == 4) {
                            charright.setImageResource(R.drawable.psychar);
                            imageThrowRight.setImageResource(R.drawable.psythrowright);
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
                            display.setText("You Choose Psychic\nComp Choose Psychic\nMatch Tied");
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