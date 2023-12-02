package com.example.calculator;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testUIInteractions() {
        // Test UI interactions for plusorminusBTN
        Espresso.onView(ViewMatchers.withId(R.id.plusorminusBTN)).perform(ViewActions.click());

        // Test UI interactions for clearBTN
        Espresso.onView(ViewMatchers.withId(R.id.clearBTN)).perform(ViewActions.click());

        // Test UI interactions for parenthesesBTN
        Espresso.onView(ViewMatchers.withId(R.id.parenthesesBTN)).perform(ViewActions.click());

        // Test UI interactions for powerBTN
        Espresso.onView(ViewMatchers.withId(R.id.powerBTN)).perform(ViewActions.click());

        // Test UI interactions for divideBTN
        Espresso.onView(ViewMatchers.withId(R.id.divideBTN)).perform(ViewActions.click());

        // Test UI interactions for multiplyBTN
        Espresso.onView(ViewMatchers.withId(R.id.multiplyBTN)).perform(ViewActions.click());

        // Test UI interactions for percentBTN
        Espresso.onView(ViewMatchers.withId(R.id.percentBTN)).perform(ViewActions.click());

        // Test UI interactions for reciprocalBTN
        Espresso.onView(ViewMatchers.withId(R.id.reciprocalBTN)).perform(ViewActions.click());
    }
}
