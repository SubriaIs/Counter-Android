package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int counter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method called "changeText" for changing text
    public void changeText (View view){
        TextView newTextView = findViewById(R.id.newTextView);
        newTextView.setText(" Hello World " + counter++);
    }
}