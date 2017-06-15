package com.example.viratpanwar.rating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText num;
    Button click;
    RatingBar rB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num =(EditText)findViewById(R.id.et);
        rB =(RatingBar)findViewById(R.id.rB);
        click=(Button)findViewById(R.id.btn);


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , num.getText().toString()+" given "+rB.getRating()+" rating", Toast.LENGTH_LONG ).show();
            }
        });

    }

}
