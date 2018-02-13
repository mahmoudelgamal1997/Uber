package com.example2017.android.uber;

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

public void customer(View v){
    Intent intent=new Intent(this,CustomerLogin.class);
    startActivity(intent);
}
    public void driver(View v){
        Intent intent=new Intent(this,DriverLogin.class);
        startActivity(intent);
    }

}

