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

public class Round3 extends AppCompatActivity implements View.OnClickListener {
    Button groundbtn, icebtn, steelbtn, quit, nextRound;
    ImageView imageThrowLeft, charleft, imageThrowRight, charright, groundThrowLeft, groundThrowRight;
    TextView display, scoredisplay;
    int player, comp, a = 1, score = 0, score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_round3);
        groundbtn = (Button) findViewById(R.id.btnGround);
        icebtn = (Button) findViewById(R.id.btnIce);
        steelbtn = (Button) findViewById(R.id.btnSteel);
        quit = (Button)findViewById(R.id.quit);
        nextRound = (Button)findViewById(R.id.round4);
        imageThrowLeft = (ImageView) findViewById(R.id.round3throwleft);
        imageThrowRight = (ImageView)findViewById(R.id.round3throwright);
        groundThrowLeft = (ImageView)findViewById(R.id.round3groundthrowleft);
        groundThrowRight = (ImageView)findViewById(R.id.round3groundthrowright);
        charleft = (ImageView) findViewById(R.id.round3charleft);
        charright = (ImageView)findViewById(R.id.round3charright);
        display = (TextView)findViewById(R.id.display);
        scoredisplay = (TextView)findViewById(R.id.score);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextRound.setEnabled(false);

        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Round3.this, Round4.class);
                startActivity(intent);
            }
        });


        groundbtn.setOnClickListener(this);
        icebtn.setOnClickListener(this);
        steelbtn.setOnClickListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {
        if(a == 4){
            groundbtn.setTextColor(Color.BLACK);
            icebtn.setTextColor(Color.BLACK);
            steelbtn.setTextColor(Color.BLACK);
            groundbtn.setEnabled(false);
            icebtn.setEnabled(false);
            steelbtn.setEnabled(false);
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
                case R.id.btnGround:
                    charleft.setImageResource(R.drawable.groundchar);
                    groundThrowRight.setImageResource(R.drawable.groundthrow);
                    AnimationDrawable fireChar = (AnimationDrawable) charleft.getDrawable();
//                    AnimationDrawable fThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation fLeftToRight = new TranslateAnimation(0, 0, 200, 0);
                    fLeftToRight.setDuration(100);
                    fLeftToRight.setFillAfter(false);
                    groundThrowRight.startAnimation(fLeftToRight);
                    groundThrowRight.setVisibility(0);
                    fireChar.start();
//                    fThrowLeft.start();

                    player = 1;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 1 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 1 && comp == 2) {
                            groundThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.icecharright);
                            imageThrowRight.setImageResource(R.drawable.icethrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
//                            compThrowWater.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.groundcharimgleft2);
                            display.setText("You Choose Ground\nComp Choose Ice\nComp Win");
                        } else if (player == 1 && comp == 3) {
                            groundThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.steelcharright);
                            imageThrowRight.setImageResource(R.drawable.steelthrow2);
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
                            charright.setImageResource(R.drawable.steelcharimgright2);
                            display.setText("You Choose Ground\nComp Choose Steel\nYou Win");
                        } else if (player == 1 && comp == 1) {
                            charright.setImageResource(R.drawable.groundcharright);
                            groundThrowLeft.setImageResource(R.drawable.groundthrow);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,0,200,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(100);
                            groundThrowLeft.startAnimation(fRightToLeft);
                            groundThrowLeft.setVisibility(0);
                            compFireChar.start();
//                            compThrowFire.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Ground\nComp Choose Ground\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnIce:
                    groundThrowRight.setImageResource(R.drawable.transparent);
                    charleft.setImageResource(R.drawable.icechar);
                    imageThrowLeft.setImageResource(R.drawable.icethrow1);
                    AnimationDrawable waterChar = (AnimationDrawable) charleft.getDrawable();
//                    AnimationDrawable wThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation wLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    wLeftToRight.setDuration(1000);
                    wLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(wLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    waterChar.start();
//                    wThrowLeft.start();

                    player = 2;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 2 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 2 && comp == 1) {
                            imageThrowRight.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.groundcharright);
                            groundThrowLeft.setImageResource(R.drawable.groundthrow);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,0,200,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(100);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compFireChar.start();
//                            compThrowFire.start();
                            score++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.groundcharimgright2);
                            display.setText("You Choose Ice\nComp Choose Ground\nYou Win");
                        } else if (player == 2 && comp == 3) {
                            groundThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.steelcharright);
                            imageThrowRight.setImageResource(R.drawable.steelthrow2);
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
                            charleft.setImageResource(R.drawable.icecharimgleft2);
                            display.setText("You Choose Ice\nComp Choose Steel\nComp Win");
                        } else if (player == 2 && comp == 2) {
                            groundThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.icecharright);
                            imageThrowRight.setImageResource(R.drawable.icethrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation wRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            wRightToLeft.setFillAfter(false);
                            wRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(wRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
//                            compThrowWater.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Ice\nComp Choose Ice\nMatch Tied");
                        }
                    } else {
                        display.setText("Error");
                    }
                    a++;
                    break;

                case R.id.btnSteel:
                    groundThrowRight.setImageResource(R.drawable.transparent);
                    charleft.setImageResource(R.drawable.steelchar);
                    imageThrowLeft.setImageResource(R.drawable.steelthrow1);
                    AnimationDrawable leafChar = (AnimationDrawable) charleft.getDrawable();
//                    AnimationDrawable lThrowLeft = (AnimationDrawable) imageThrowLeft.getDrawable();
                    Animation lLeftToRight = new TranslateAnimation(0, 1000, 0, 0);
                    lLeftToRight.setDuration(100);
                    lLeftToRight.setFillAfter(false);
                    imageThrowLeft.startAnimation(lLeftToRight);
                    imageThrowLeft.setVisibility(0);
                    leafChar.start();
//                    lThrowLeft.start();

                    player = 3;
                    comp = (int) (Math.random() * (3 - 1 + 1) + 1);
                    if (player == 3 && comp == 1 || comp == 2 || comp == 3) {
                        if (player == 3 && comp == 1) {
                            charright.setImageResource(R.drawable.groundcharright);
                            groundThrowLeft.setImageResource(R.drawable.groundthrow);
                            AnimationDrawable compFireChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowFire = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,0,200,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            groundThrowLeft.startAnimation(fRightToLeft);
                            groundThrowLeft.setVisibility(0);
                            compFireChar.start();
//                            compThrowFire.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charleft.setImageResource(R.drawable.steelcharimgleft2);
                            display.setText("You Choose Steel\nComp Choose Ground\nComp Win");
                        } else if (player == 3 && comp == 2) {
                            groundThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.icecharright);
                            imageThrowRight.setImageResource(R.drawable.icethrow2);
                            AnimationDrawable compWaterChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowWater = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation fRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            fRightToLeft.setFillAfter(false);
                            fRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(fRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compWaterChar.start();
//                            compThrowWater.start();
                            score1++;
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            charright.setImageResource(R.drawable.icecharimgright2);
                            display.setText("You Choose Steel\nComp Choose Ice\nYou Win");
                        } else if (player == 3 && comp == 3) {
                            groundThrowLeft.setImageResource(R.drawable.transparent);
                            charright.setImageResource(R.drawable.steelcharright);
                            imageThrowRight.setImageResource(R.drawable.steelthrow2);
                            AnimationDrawable compLeafChar = (AnimationDrawable) charright.getDrawable();
//                            AnimationDrawable compThrowLeaf = (AnimationDrawable) imageThrowRight.getDrawable();
                            Animation wRightToLeft = new TranslateAnimation(0,-1000,0,0);
                            wRightToLeft.setFillAfter(false);
                            wRightToLeft.setDuration(1000);
                            imageThrowRight.startAnimation(wRightToLeft);
                            imageThrowRight.setVisibility(0);
                            compLeafChar.start();
//                            compThrowLeaf.start();
                            scoredisplay.setText("You: " + score + "\nComp: " + score1);
                            display.setText("You Choose Steel\nComp Choose Steel\nMatch Tied");
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