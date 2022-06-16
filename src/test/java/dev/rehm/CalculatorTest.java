package dev.rehm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSumPositiveNumbers(){
        assertEquals(10, calculator.add(4,6));
    }

    @Test
    public void testSumNegativeNumbers(){
        assertEquals(-100, calculator.add(-12,-88));
    }

    @Test
    public void testDifferencePositiveNumbers(){
        assertEquals(12, calculator.subtract(20,8));
    }

    @Test
    public void testDifferenceNegativeNumbers(){
        assertEquals(-5, calculator.subtract(-25,-20));
    }
}
