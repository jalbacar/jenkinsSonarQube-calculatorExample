package com.juanma.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorMyService {
    int rest(int a, int b) {
        return a - b;
    }
}
