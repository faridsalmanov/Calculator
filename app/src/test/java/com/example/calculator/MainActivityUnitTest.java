package com.example.calculator;
import static org.junit.Assert.assertEquals;
import android.widget.EditText;
import org.junit.Before;
import org.junit.Test;
public class MainActivityUnitTest {
    private MainActivity mainActivity;
    @Before
    public void setUp() {
        mainActivity = new MainActivity();
        mainActivity.display = new EditText(mainActivity);
    }

    @Test
    public void testPlusOrMinusButton() {
        // Test for toggling positive to negative
        mainActivity.display.setText("5");
        mainActivity.plusorminusBTN(null);
        assertEquals("-5", mainActivity.display.getText().toString());

        // Test for toggling negative to positive
        mainActivity.display.setText("-8");
        mainActivity.plusorminusBTN(null);
        assertEquals("8", mainActivity.display.getText().toString());
    }

    @Test
    public void testClearButton() {
        // Test for clearing a non-empty display
        mainActivity.display.setText("123");
        mainActivity.clearBTN(null);
        assertEquals("", mainActivity.display.getText().toString());

        // Test for  clearing an empty display (should have no effect)
        mainActivity.clearBTN(null);
        assertEquals("", mainActivity.display.getText().toString());
    }

    @Test
    public void testParenthesesButton() {
        // Test for adding an opening parenthesis
        mainActivity.display.setText("2+3");
        mainActivity.parenthesesBTN(null);
        assertEquals("2+3(", mainActivity.display.getText().toString());

        // Test for adding a closing parenthesis
        mainActivity.display.setText("2+3(");
        mainActivity.parenthesesBTN(null);
        assertEquals("2+3()", mainActivity.display.getText().toString());
    }

    @Test
    public void testPowerButton() {
        // Test for raising a positive number to a power
        mainActivity.display.setText("2");
        mainActivity.powerBTN(null);
        assertEquals("2^", mainActivity.display.getText().toString());

        // Test for raising a negative number to a power
        mainActivity.display.setText("-3");
        mainActivity.powerBTN(null);
        assertEquals("-3^", mainActivity.display.getText().toString());

        // Test for raising to the power of zero
        mainActivity.display.setText("5");
        mainActivity.powerBTN(null);
        assertEquals("5^", mainActivity.display.getText().toString());
    }

    @Test
    public void testDivideButton() {
        // Test for dividing a positive number
        mainActivity.display.setText("10");
        mainActivity.divideBTN(null);
        assertEquals("10÷", mainActivity.display.getText().toString());

        // Test dividing a negative number
        mainActivity.display.setText("-8");
        mainActivity.divideBTN(null);
        assertEquals("-8÷", mainActivity.display.getText().toString());

        // Test dividing by zero
        mainActivity.display.setText("0");
        mainActivity.divideBTN(null);
        assertEquals("0÷", mainActivity.display.getText().toString());
    }

    @Test
    public void testMultiplyButton() {
        // Test multiplying a positive number
        mainActivity.display.setText("4");
        mainActivity.multiplyBTN(null);
        assertEquals("4×", mainActivity.display.getText().toString());

        // Test multiplying a negative number
        mainActivity.display.setText("-7");
        mainActivity.multiplyBTN(null);
        assertEquals("-7×", mainActivity.display.getText().toString());
    }

    @Test
    public void testPercentButton() {
        // Test calculating percentage of a positive number
        mainActivity.display.setText("50");
        mainActivity.percentBTN(null);
        assertEquals("50%", mainActivity.display.getText().toString());

        // Test calculating percentage of a negative number
        mainActivity.display.setText("-30");
        mainActivity.percentBTN(null);
        assertEquals("-30%", mainActivity.display.getText().toString());
    }

    @Test
    public void testReciprocalButton() {
        // Test taking the reciprocal of a positive number
        mainActivity.display.setText("2");
        mainActivity.reciprocalBTN(null);
        assertEquals("1/2", mainActivity.display.getText().toString());

        // Test taking the reciprocal of a negative number
        mainActivity.display.setText("-5");
        mainActivity.reciprocalBTN(null);
        assertEquals("1/-5", mainActivity.display.getText().toString());

        // Test taking the reciprocal of zero
        mainActivity.display.setText("0");
        mainActivity.reciprocalBTN(null);
        assertEquals("1/0", mainActivity.display.getText().toString());
    }


    @Test
    public void testAdditionButton() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("2+2");
        mainActivity.plusBTN(null);
        assertEquals("2+2+", mainActivity.display.getText().toString());
    }
    @Test
    public void testAdditionWithNegativeIntegers() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("-2");
        mainActivity.plusBTN(null);
        mainActivity.display.setText("-3");
        mainActivity.equalsBTN(null);
        assertEquals("-5", mainActivity.display.getText().toString());
    }

    @Test
    public void testAdditionWithDecimalNumbers() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("2.5");
        mainActivity.plusBTN(null);
        mainActivity.display.setText("1.3");
        mainActivity.equalsBTN(null);
        assertEquals("3.8", mainActivity.display.getText().toString());
    }

    @Test
    public void testAdditionWithComplexExpression() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("2");
        mainActivity.plusBTN(null);
        mainActivity.display.setText("3*4");
        mainActivity.equalsBTN(null);
        assertEquals("14", mainActivity.display.getText().toString());
    }
    @Test
    public void testEqualsButton() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("2+2");
        mainActivity.equalsBTN(null);
        assertEquals("4", mainActivity.display.getText().toString());
    }

    @Test
    public void testMinusButton() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("5");
        mainActivity.minusBTN(null);
        assertEquals("5-", mainActivity.display.getText().toString());
    }
    @Test
    public void testSubtractionOfDecimalNumbers() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("5.5");
        mainActivity.minusBTN(null);
        mainActivity.display.setText("3.2");
        mainActivity.equalsBTN(null);
        assertEquals("2.3", mainActivity.display.getText().toString());
    }

    @Test
    public void testDeleteButton() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("123");
        mainActivity.backspaceBTN(null);
        assertEquals("12", mainActivity.display.getText().toString());
    }
    @Test
    public void testDeleteFromEmptyDisplay() {
        MainActivity mainActivity = new MainActivity();

        // Trigger the backspaceBTN method on an empty display
        mainActivity.backspaceBTN(null);

        // Verify that the display remains empty
        assertEquals("", mainActivity.display.getText().toString());
    }

    @Test
    public void testSquareRootOf9() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("√9");
        mainActivity.squareRootBTN(null);
        assertEquals("3", mainActivity.display.getText().toString());
    }
    @Test
    public void testSquareRootOfNonPerfectSquare() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.display.setText("√7");
        mainActivity.squareRootBTN(null);
        assertEquals("√7", mainActivity.display.getText().toString());
    }
    @Test
    public void testPointButton() {
        // Test adding a decimal point to a positive integer
        mainActivity.display.setText("123");
        mainActivity.pointBTN(null);
        assertEquals("123.", mainActivity.display.getText().toString());

        // Test adding a decimal point to a negative integer
        mainActivity.display.setText("-456");
        mainActivity.pointBTN(null);
        assertEquals("-456.", mainActivity.display.getText().toString());

        // Test adding a decimal point to a decimal number
        mainActivity.display.setText("789.01");
        mainActivity.pointBTN(null);
        assertEquals("789.01.", mainActivity.display.getText().toString());

        // Test adding a decimal point to an empty display
        mainActivity.pointBTN(null);
        assertEquals("0.", mainActivity.display.getText().toString());

        // Test adding multiple decimal points (should ignore additional points)
        mainActivity.display.setText("23.45");
        mainActivity.pointBTN(null);
        assertEquals("23.45", mainActivity.display.getText().toString());

        // Test adding a decimal point after an operator
        mainActivity.display.setText("12+");
        mainActivity.pointBTN(null);
        assertEquals("12+0.", mainActivity.display.getText().toString());
    }
}

