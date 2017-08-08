package com.example.android.robot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //display moving forward to the user
    public void moveForward(View view){
        Toast.makeText(getApplicationContext(), "Moving Forward", Toast.LENGTH_LONG).show();
    }

    //display moving backward to the user
    public void moveBackward(View view){
        Toast.makeText(getApplicationContext(), "Moving Backward", Toast.LENGTH_LONG).show();
    }

    //display stop moving to the user
    public void stop(View view){
        Toast.makeText(getApplicationContext(), "Stop Moving", Toast.LENGTH_LONG).show();
    }

    //display turning right to the user
    public void turnRight(View view){
        Toast.makeText(getApplicationContext(), "Turning Right", Toast.LENGTH_LONG).show();
    }

    //display moving backward to the user
    public void turnLeft(View view){
        Toast.makeText(getApplicationContext(), "Turning Left", Toast.LENGTH_LONG).show();
    }
}
