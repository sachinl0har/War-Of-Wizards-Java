package com.example.warofwizards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import static com.example.warofwizards.Round1.result;
import static com.example.warofwizards.Round1.result1;

public class Result extends AppCompatActivity {
    TextView resultshow;
    Button quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result);
        resultshow = (TextView)findViewById(R.id.result);
        quit = (Button)findViewById(R.id.quit);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
            }
        });

        if(result > result1){
            resultshow.setText("You Win\nYou: " + result + "\nComp: " + result1);
        }else if(result == result1){
            resultshow.setText("Match Tied\nYou: " + result + "\nComp: " + result1);
        }else{
            resultshow.setText("Comp Win\nYou: " + result + "\nComp: " + result1);
        }
        result = 0;
        result1 = 0;
    }
}