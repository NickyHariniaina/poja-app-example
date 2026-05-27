package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b cannot be negative");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b cannot be negative");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b cannot be negative");
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (a < 0 || b <= 0) {
             throw new IllegalArgumentException("a or b cannot be negative");
        }
        if (b == 0) {
            throw new IllegalArgumentException("b cannot be 0");
        }
        return a / b;
    }

}
