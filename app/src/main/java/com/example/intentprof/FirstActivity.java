package com.example.intentprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button OK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = (EditText) findViewById(R.id.val1);
        num2 = (EditText) findViewById(R.id.val2);
        OK = (Button) findViewById(R.id.button);

        OK.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //set the values pass to the next act
                intent.putExtra("NUMBER1",num1.getText().toString());//Get the value for num1
                intent.putExtra("NUMBER2",num2.getText().toString());//Get the value for num2

                //implement toast message in application
                Context context = getApplicationContext();//The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";
                //Display string
                int duration = Toast.LENGTH_LONG;//How long the toast message will lasts

                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity( Gravity.TOP|Gravity.LEFT, 270, 1400);
                toast.show();
                startActivity(intent);

            }
        }));
    }
}
