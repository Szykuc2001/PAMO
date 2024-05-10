///Szymon Kuczyński s22466
package com.example.lab2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChartActivity extends AppCompatActivity {

    private  List<String> xValues = Arrays.asList("April", "May", "June", "July");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_chart);

        BarChart barChart = findViewById(R.id.chart);
        barChart.getAxisRight().setDrawLabels(false);

        ArrayList < BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0,45f));
        entries.add(new BarEntry(1,80f));
        entries.add(new BarEntry(2,65f));
        entries.add(new BarEntry(3,38f));


        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setAxisMinimum(0f); // Corrected from setAxisMaximum(0f);
        yAxis.setAxisMaximum(100f);
        yAxis.setAxisLineWidth(2f);
        yAxis.setAxisLineColor(Color.BLACK);

        BarDataSet dataSet = new BarDataSet(entries, "Scale");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        BarData barData = new BarData(dataSet);
        barChart.setData(barData);

        barChart.getDescription().setEnabled(true);
        barChart.invalidate();

        barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(xValues));
        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        barChart.getXAxis().setGranularity(1f);
        barChart.getXAxis().setGranularityEnabled(true);
    }

}
