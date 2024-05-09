package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);
    }

    public void openMain2(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void openMain3(View view) {
        startActivity(new Intent(this,MainActivity3.class));
    }

    public void openMain4(View view) {
        startActivity(new Intent(this,MainActivity4.class));
    }
}