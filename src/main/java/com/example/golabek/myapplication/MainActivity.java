package com.example.golabek.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView N1;
    TextView N2;
    TextView COMMS;
    EditText S;
    Button  RN;
    Button  CECKS;

    int x1;
    int x2;

    Random y1 = new Random();
    Random y2 = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        N1 = findViewById(R.id.FirstNumber);
        N2 = findViewById(R.id.SecondNumber);
        COMMS = findViewById(R.id.CommentSol);
        S = findViewById(R.id.Solution);
        RN = findViewById(R.id.RandomNumbers);
        CECKS = findViewById(R.id.CheckSolution);




        RN.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                x1 = y1.nextInt(11);
                x2 = y2.nextInt(11);

                N1.setText(""+x1);
                N2.setText(""+x2);

            }
        });


        CECKS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int wynik = x1 * x2;
                String userw;

                if (S.getText().toString().equals("")) {

                    userw = "";

                } else {
                    userw = S.getText().toString();
                }

                if( userw == "") {

                    COMMS.setText("Podaj jakiś wynik obliczeń!!! :(");
                    COMMS.setTextColor(Color.RED);


                    } else {


                if(wynik==Integer.parseInt(userw)){

                    COMMS.setText("Brawo! Poprawna odpowiedź :)");
                    COMMS.setTextColor(Color.MAGENTA);

                     } else {

                    COMMS.setText("Zła odpowiedz! :(");
                    COMMS.setTextColor(Color.RED);
                }

                 }


            }


        } );




    }
}
