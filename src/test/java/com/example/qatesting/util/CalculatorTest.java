package com.example.qatesting.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

   private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum(){
        int result = calculator.sum(1, 2);
    Assertions.assertEquals(3, result);
    }

    @Test
    void evenOrOdd_evenNumber() {
        boolean result = calculator.evenOdd(10);
        Assertions.assertTrue(result);
    }

    @Test
    void evenOrOdd_oddNumber() {
        boolean result = calculator.evenOdd(15);
        Assertions.assertFalse(result);
    }

    @Test
    void divideByZero() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));

    }

}
