package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
  public long add(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    if (a > Long.MAX_VALUE - b) {
      return Long.MAX_VALUE;
    }
    return a + b;
  }

  public long subtract(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    return a - b;
  }

  public long multiply(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    if (b == 0) {
      return 0;
    }
    if (a > Long.MAX_VALUE / b) {
      return Long.MAX_VALUE;
    }
    return a * b;
  }

  public long divide(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a or b cannot be negative");
    }
    if (b == 0) {
      throw new IllegalArgumentException("b cannot be 0");
    }
    return a / b;
  }
}
