package com.techbeesolutions;

import com.techbeesolutions.calculator.calculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestCalculator {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before - I am only called Once!!!");
    }

    @Test
    public void calculateSum() {
        Integer x = 9;
        Integer y = 9;
        Integer expResult = x + y;
        Integer result = calculator.sum(x, y);

        assertSame(expResult, result);
    }

    @Test
    public void calculateDifference() {
        Integer x = 9;
        Integer y = 8;
        Integer expResult = x - y;
        Integer result = calculator.difference(x, y);

        assertSame(expResult, result);
    }

    @Test
    public void calculateDivide() {
        Integer x = 15;
        Integer y = 15;
        Integer expResult = x / y;
        Integer result = calculator.divide(x, y);

        assertSame(expResult, result);
    }

    @Test
    public void calculateMultiply() {
        Integer x = 15;
        Integer y = 15;
        Integer expResult = x * y;
        Integer result = calculator.multiply(x, y);

        assertEquals(expResult, result);
    }
}

