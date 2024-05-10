///Szymon Kuczyński s22466
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

public class CalorieActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_calorie);
    }

    public void openHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }
}
