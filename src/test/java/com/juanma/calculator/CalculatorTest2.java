package com.juanma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest2 {
    private CalculatorService2 calculatorService2 = new CalculatorService2();

    @Test
    public void testSubs() {
        assertEquals(1, calculatorService2.subs(3,2));
    }
}
