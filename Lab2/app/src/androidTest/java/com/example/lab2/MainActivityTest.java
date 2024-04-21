package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    @Test
    public void testCalculateBMI() {
        // Input values
        float height = 180.0f; // Height in centimeters
        float weight = 70.0f; // Weight in kilograms

        // Calculate BMI
        float heightInMeters = height / 100;
        float bmi = weight / (heightInMeters * heightInMeters);

        // Expected BMI value
        float expectedBMI = 21.6f;

        // Check if calculated BMI matches expected BMI
        assertEquals(expectedBMI, bmi, 0.01); // 0.01 is the delta for float comparison
    }
}