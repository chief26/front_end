package com.example.shaunmesias.assignment_6_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ButtonClick(View v){
        //this statement works
        //((TextView)findViewById(R.id.textView)).setText("worked");

        //this statements works
        /*String value = "";
        value = ((EditText)findViewById(R.id.editText)).getText().toString();
        ((TextView)findViewById(R.id.textView)).setText(value);*/

        startActivity(new Intent(MainActivity.this, AddDriverActivity.class));
    }

    public void ButtonClickFind(View v){
       // startActivity(new Intent(MainActivity.this, FindPersonActivity.class));
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void ButtonClickViewAll(View v){
        startActivity(new Intent(MainActivity.this, ViewAllActivity.class));
    }
}
