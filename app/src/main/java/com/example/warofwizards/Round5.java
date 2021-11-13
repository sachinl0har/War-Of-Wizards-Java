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

public class Round5 extends AppCompatActivity implements View.OnClickListener {
    Button fire5btn, water5btn, leaf5btn, rock5btn, electric5btn, quit, nextRound;
    ImageView imageThrowLeft, charleft, imageThrowRight, charright, rockimgthrowleft, rockimgthrowright;
    TextView display, scoredisplay;
    int player, comp, a = 1, health = 500, health1 = 500;

    int score = 0, score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_round5);
        fire5btn = (Button) findViewById(R.id.btnFire5);
        water5btn = (Button) findViewById(R.id.btnWater5);
        leaf5btn = (Button) findViewById(R.id.btnLeaf5);
        rock5btn = (Button) findViewById(R.id.btnRock5);
        electric5btn = (Button) findViewById(R.id.btnElectric5);
        quit = (Button)findViewById(R.id.quit);
        nextRound = (Button)findViewById(R.id.resultscreen);
        imageThrowLeft = (ImageView) findViewById(R.id.round5throwleft);
        imageThrowRight = (ImageView)findViewById(R.id.round5throwright);
        rockimgthrowright = (ImageView)findViewById(R.id.round5rockthrowright);
        rockimgthrowleft = (ImageView)findViewById(R.id.round5rockthrowleft);
        charleft = (ImageView) findViewById(R.id.round5charleft);
        charright = (ImageView)findViewById(R.id.round5charright);
        display = (TextView)findViewById(R.id.display);
        scoredisplay = (TextView)findViewById(R.id.score);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round5.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextRound.setEnabled(false);

        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round5.this, Result.class);
                startActivity(intent);
            }
        });


        fire5btn.setOnClickListener(this);
        water5btn.setOnClickListener(this);
        leaf5btn.setOnClickListener(this);
        rock5btn.setOnClickListener(this);
        electric5btn.setOnClickListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {
        if(health == 0 || health1 == 0){
            fire5btn.setTextColor(Color.BLACK);
            water5btn.setTextColor(Color.BLACK);
            leaf5btn.setTextColor(Color.BLACK);
            rock5btn.setTextColor(Color.BLACK);
            electric5btn.setTextColor(Color.BLACK);
            fire5btn.setEnabled(false);
            water5btn.setEnabled(false);
            leaf5btn.setEnabled(false);
            rock5btn.setEnabled(false);
            electric5btn.setEnabled(false);
            nextRound.setTextColor(Color.GREEN);
            nextRound.setEnabled(true);
            if(health > health1){
                result = result + 1;
            }else if(health == health1){

            }else{
                result1 = result1 + 1;
            }
        }else{
            switch (v.getId()){
                case R.id.btnFire5:
                    charleft.setImageResource(R.drawable.firechar);
                    imageThrowLeft.setImageResource(R.drawable.firethrowleft);
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
                    comp = (int) (Math.random() * (5 - 1 + 1) + 1);
                    if (player == 1 && comp == 1 || comp == 2 || comp == 3 || comp == 4 || comp == 5) {
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
                            health = health - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.firecharimgleft2);
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
                            health1 = health1 - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.leafcharimgright2);
                            display.setText("You Choose Fire\nComp Choose Leaf\nComp Win");
                        }else if (player == 1 && comp == 4) {
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
//                            compThrowLeaf.start();
                            health = health - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.firecharimgleft2);
                            display.setText("You Choose Fire\nComp Choose Rock\nComp Win");
                        }else if (player == 1 && comp == 5) {
                            charright.setImageResource(R.drawable.electriccharright);
                            imageThrowRight.setImageResource(R.drawable.electricthrow2);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
//                            compThrowLeaf.start();
                            health1 = health1 - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.firecharimgleft2);
                            display.setText("You Choose Fire\nComp Choose Electric\nYou Win");
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

                case R.id.btnWater5:
                    charleft.setImageResource(R.drawable.waterchar);
                    imageThrowLeft.setImageResource(R.drawable.waterthrowleft);
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
                    comp = (int) (Math.random() * (5 - 1 + 1) + 1);
                    if (player == 2 && comp == 1 || comp == 2 || comp == 3 || comp == 4 || comp == 5) {
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
                            health1 = health1 - 50;
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
                            health = health - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.watercharimgleft2);
                            display.setText("You Choose Water\nComp Choose Leaf\nComp Win");
                        }else if (player == 2 && comp == 4) {
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
//                            compThrowLeaf.start();
                            health1 = health1 - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.rockcharimgright2);
                            display.setText("You Choose Water\nComp Choose Rock\nYou Win");
                        }else if (player == 2 && comp == 5) {
                            charright.setImageResource(R.drawable.electriccharright);
                            imageThrowRight.setImageResource(R.drawable.electricthrow2);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
//                            compThrowLeaf.start();
                            health = health - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.watercharimgleft2);
                            display.setText("You Choose Water\nComp Choose Electric\nComp Win");
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
                    charleft.setImageResource(R.drawable.leafchar);
                    imageThrowLeft.setImageResource(R.drawable.leafcharimgleft);
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
                    comp = (int) (Math.random() * (5 - 1 + 1) + 1);
                    if (player == 3 && comp == 1 || comp == 2 || comp == 3 || comp == 4 || comp == 5) {
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
                            health = health - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.leafcharimgleft2);
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
                            health1 = health1 - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.watercharimgleft2);
                            display.setText("You Choose Leaf\nComp Choose Water\nYou Win");
                        }else if (player == 3 && comp == 4) {
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
//                            compThrowLeaf.start();
                            health1 = health1 - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.rockcharimgright2);
                            display.setText("You Choose Leaf\nComp Choose Rock\nYou Win");
                        }else if (player == 3 && comp == 5) {
                            charright.setImageResource(R.drawable.electriccharright);
                            rockimgthrowleft.setImageResource(R.drawable.electricthrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) rockimgthrowright.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,0,-200,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            rockimgthrowleft.startAnimation(fRightToLeft);
                            rockimgthrowleft.setVisibility(0);
                            compWaterChar.start();
//                            compThrowLeaf.start();
                            health1 = health1 - 50;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.rockcharimgright2);
                            display.setText("You Choose Leaf\nComp Choose Electric\nYou Win");
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

                case R.id.btnRock:
                    charleft.setImageResource(R.drawable.rockchar);
                    rockimgthrowright.setImageResource(R.drawable.rockthrow1);
                    AnimationDrawable rwaterChar = (AnimationDrawable) charleft.getDrawable();
//                    AnimationDrawable wThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation rwLeftToRight = new TranslateAnimation(0, 0, -200, 0);
                    rwLeftToRight.setDuration(1000);
                    rwLeftToRight.setFillAfter(false);
                    rockimgthrowright.startAnimation(rwLeftToRight);
                    rockimgthrowright.setVisibility(0);
                    rwaterChar.start();
//                    wThrowLeft.start();

                    player = 4;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 4 && comp == 1 || comp == 2 || comp == 3) {
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