package com.example.lab2;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityEspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testCalculateBMI() {
        // Input values
        String height = "180";
        String weight = "70";

        // Enter height and weight into EditText fields
        Espresso.onView(ViewMatchers.withId(R.id.height))
                .perform(ViewActions.typeText(height));
        Espresso.onView(withId(R.id.weight))
                .perform(ViewActions.typeText(weight), ViewActions.closeSoftKeyboard());

        // Click on the submit button
        Espresso.onView(withId(R.id.btnSubmit)).perform(ViewActions.click());

        // Expected BMI value
        String expectedBMI = "21.60494";

        // Check if the TextView displays the expected BMI value
        Espresso.onView(withId(R.id.result))
                .check(matches(ViewMatchers.withText(expectedBMI)));
    }
}