package com.juanma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private CalculatorMyService calculatorMyService = new CalculatorMyService();

    @Test
    public void testRest() {
        assertEquals(1, calculatorService.rest(3,2));
    }
}
