///Szymon Kuczyński s22466
package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
    }

    public void openChart(View view) {
        startActivity(new Intent(this, ChartActivity.class));
    }
    public void openCalculator(View view) {
        startActivity(new Intent(this, CalculatorActivity.class));
    }

    public void openCalorie(View view) {
        startActivity(new Intent(this, CalorieActivity.class));
    }

    public void openRecipeList(View view) {
        startActivity(new Intent(this, RecipeListActivity.class));
    }


}
