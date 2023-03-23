package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.security.Key;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_COUNT = "key";

    private TextView textCount;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = findViewById(R.id.textView2);


    }

    public void onCountClick(View view) {
        count++;
        textCount.setText(Integer.toString(count));
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {

        Toast toast = Toast.makeText(getApplicationContext(),"onSaveInstanceState", Toast.LENGTH_SHORT);
        toast.show();
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_COUNT, count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getApplicationContext(),"onRestoreInstanceState", Toast.LENGTH_SHORT);
        toast.show();
        super.onRestoreInstanceState(savedInstanceState);

        count = savedInstanceState.getInt(KEY_COUNT);
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStart()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {

        super.onPause();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

}