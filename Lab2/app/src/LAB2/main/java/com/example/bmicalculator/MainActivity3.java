package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    Button btn;
    EditText height,weight,age;
    TextView result;
    LinearLayout malelayout, femalelayout;
    ImageView mimg,fimg;
    Double h=0.0, w=0.0, a=0.0, bmr=0.0;
    String user="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
       btn=findViewById(R.id.btncal);
       height=findViewById(R.id.heighttxt);
       weight=findViewById(R.id.weighttxt);
       age=findViewById(R.id.agetxt);
       result=findViewById(R.id.result);
       malelayout=findViewById(R.id.male);
       femalelayout=findViewById(R.id.female);
       mimg=findViewById(R.id.maleimg);
       fimg=findViewById(R.id.femaleimg);

       malelayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               user="Male";
           }
       });
        femalelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user="Female";
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = height.getText().toString();
                String str2 = weight.getText().toString();
                String str3 = age.getText().toString();
                if (user.equals("0")) {
                    Toast.makeText(MainActivity3.this, "Select your Gender", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(str1)) {
                    height.setError("Select Height");
                    height.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(str2)) {
                    weight.setError("Select Weight");
                    weight.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(str3)) {
                    age.setError("Select age");
                    age.requestFocus();
                    return;
                }
                else {
                    calculate();
                }
            }
        });

    }
    private void calculate(){
        h=Double.parseDouble(height.getText().toString());
        w=Double.parseDouble(weight.getText().toString());
        a=Double.parseDouble(age.getText().toString());
        if (user.equals("Male")) {
            bmr=(66.5+(13.75*w)+(5.003*h)-(6.775*a));

            result.setText(Double.toString(bmr));
        } else if (user.equals("Female")) {
            bmr=(655.1+(9.563*w)+(1.85*h)-(4.676*a));
            result.setText(Double.toString(bmr));
        }

    }

    public void openMain1(View view) {
        startActivity(new Intent(this,MainActivity1.class));
    }
}