package com.example.intentprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


    //create layout as template
    LayoutInflater layoutInflater = getLayoutInflater();
    View layout = layoutInflater.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        nextPage = (Button) findViewById(R.id.Calculator);

                //implement toast
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.setView(layout);
                toast.show();

                //when click on the button redirect to calculator
                nextPage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                        startActivity(intent);
                    }

                });

    }
}
