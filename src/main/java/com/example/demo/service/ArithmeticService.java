package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
  public int add(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    long result = (long) a + b;
    return (int) Math.min(result, Integer.MAX_VALUE);
  }

  public int subtract(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    return Math.subtractExact(a, b);
  }

  public int multiply(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    long result = (long) a * b;
    return (int) Math.min(result, Integer.MAX_VALUE);
  }

  public int divide(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    if (b == 0) {
      throw new IllegalArgumentException("b cannot be 0");
    }
    return a / b;
  }
}
