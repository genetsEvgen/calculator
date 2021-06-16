package com.company.tests;

import com.company.ExpressionCalculator;
import com.company.exceptions.InvalidNumberException;
import com.company.exceptions.InvalidOperationException;
import com.company.exceptions.MixNumberException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionCalculatorTest {

    @Test
    public void execute_arab_plus() throws MixNumberException, InvalidNumberException, InvalidOperationException {
        ExpressionCalculator calculator = new ExpressionCalculator("12 + 7");
        String expected = "19";

        String actual = calculator.execute().getValue();

        assertEquals(expected, actual);
    }

    @Test(expected = MixNumberException.class)
    public void execute_arab_plus_roman() throws MixNumberException, InvalidNumberException, InvalidOperationException {
        ExpressionCalculator calculator = new ExpressionCalculator("12 + V");
        calculator.execute();
    }
}