package com.snehil.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPopularMovies = (Button) findViewById(R.id.button_popular_movies);
        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display toast in response to button click
                Context context=getApplicationContext();
                CharSequence text="This button will launch the Popular Movies app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context,text,duration);
                toast.show();
            }
        });


        Button buttonStockHawk = (Button) findViewById(R.id.button_stock_hawk);
        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display toast in response to button click
                Context context=getApplicationContext();
                CharSequence text="This button will launch the Stock Hawk app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context,text,duration);
                toast.show();
            }
        });


        Button buttonBuildBigger = (Button) findViewById(R.id.button_build_bigger);
        buttonBuildBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display toast in response to button click
                Context context=getApplicationContext();
                CharSequence text="This button will launch the Build It Bigger app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context,text,duration);
                toast.show();
            }
        });


        Button buttonMakeMaterial = (Button) findViewById(R.id.button_make_material);
        buttonMakeMaterial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display toast in response to button click
                Context context=getApplicationContext();
                CharSequence text="This button will launch the Make Your App Material app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context,text,duration);
                toast.show();
            }
        });


        Button buttonUbiquitous = (Button) findViewById(R.id.button_ubiquitous);
        buttonUbiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display toast in response to button click
                Context context=getApplicationContext();
                CharSequence text="This button will launch the Go Ubiquitous app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context,text,duration);
                toast.show();
            }
        });


        Button buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display toast in response to button click
                Context context=getApplicationContext();
                CharSequence text="This button will launch my Capstone Project app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context,text,duration);
                toast.show();
            }
        });
    }


}
