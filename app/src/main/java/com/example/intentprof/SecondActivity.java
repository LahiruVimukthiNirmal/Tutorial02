package com.example.intentprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView value1;
    TextView value2;
    TextView method;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;

    String num1;
    String num2;

    int val1,val2,total =0;

    CharSequence message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        value1 = (TextView) findViewById(R.id.val1);
        value2 = (TextView) findViewById(R.id.val2);
        method = (TextView) findViewById(R.id.answer);

        addition = (Button) findViewById(R.id.button2);
        subtraction =(Button) findViewById(R.id.button3);
        multiplication = (Button) findViewById(R.id.button4);
        division = (Button) findViewById(R.id.button5);

        Intent receive = getIntent();

        //get passed values to variables
        num1 = receive.getStringExtra("NUMBER1");
        num2 = receive.getStringExtra("NUMBER2");

        value1.setText(num1);
        value2.setText(num2);

        //convert string variable to Integer
        val1 = Integer.parseInt(num1);
        val2 = Integer.parseInt(num2);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context,message,duration);
        toast.setGravity( Gravity.TOP,0,0);

        //This execute when press Add button
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" + "+ val2 +" = "+ (val1+val2));

                message = "Addition two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();

            }
        });

        //This execute when press minus button
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" - "+ val2 +" = "+ (val1-val2));

                message = "Subtract two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        //This execute when press Multiply button
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" * "+ val2 +" = "+ (val1*val2));

                message = "Multiply two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        //This execute when press Devide button
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" / "+ val2 +" = "+ (float)(val1/val2));

                message = "Devide two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });
    }
}
