package com.example.keerthipreethi.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
//import android.widget.Toast;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private TextView single,Double,boundary,nb,sixer,res;
    private CheckBox start,end;
    private Button final_score,six,noball,plus4,plus2,plus1;
    private EditText num;
    float mValueOne;
    boolean Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start= findViewById(R.id.game_started);
        end= findViewById(R.id.game_ended);
        final_score= findViewById(R.id.final_score);
        six= findViewById(R.id.six);
        noball= findViewById(R.id.noball);
        plus4= findViewById(R.id.plus4);
        plus2= findViewById(R.id.plus2);
        plus1= findViewById(R.id.plus1);
        num=findViewById(R.id.num);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(num.getText() + "");
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(num.getText() + "");
            }
        });
        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(num.getText() + "");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(num.getText() + "");
            }
        });
        noball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(num.getText() + "");
            }
        });
        final_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num == null) {
                    num.setText("");
                } else {
                    mValueOne = Float.parseFloat(num.getText() + "");
                    Add = true;
                    num.setText(null);
                }
            }
        });

    }
}
