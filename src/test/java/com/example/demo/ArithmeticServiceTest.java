package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.demo.service.ArithmeticService;
import org.junit.jupiter.api.Test;

public class ArithmeticServiceTest {

  ArithmeticService arithmeticService = new ArithmeticService();

  @Test
  void add_with_positive_numbers_returns_sum() {
    assertEquals(8, arithmeticService.add(3, 5));
  }

  @Test
  void add_with_negative_a_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.add(-1, 5));
  }

  @Test
  void add_with_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.add(5, -1));
  }

  @Test
  void add_with_zero_numbers_returns_sum() {
    assertEquals(0, arithmeticService.add(0, 0));
  }

  @Test
  void add_with_zero_a_and_positive_b_returns_sum() {
    assertEquals(5, arithmeticService.add(0, 5));
  }

  @Test
  void add_with_positive_a_and_zero_b_returns_sum() {
    assertEquals(5, arithmeticService.add(5, 0));
  }

  @Test
  void add_with_very_large_b_returns_max_value() {
    assertEquals(Long.MAX_VALUE, arithmeticService.add(3, 2458235923705L));
  }

  @Test
  void add_with_both_max_value_returns_max_value() {
    assertEquals(Long.MAX_VALUE, arithmeticService.add(Long.MAX_VALUE, Long.MAX_VALUE));
  }

  @Test
  void add_with_both_negative_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.add(-3, -5));
  }

  @Test
  void subtract_with_a_greater_than_b_returns_difference() {
    assertEquals(7, arithmeticService.subtract(10, 3));
  }

  @Test
  void subtract_with_equal_numbers_returns_zero() {
    assertEquals(0, arithmeticService.subtract(5, 5));
  }

  @Test
  void subtract_with_a_less_than_b_returns_negative() {
    assertEquals(-2, arithmeticService.subtract(3, 5));
  }

  @Test
  void subtract_with_zero_a_and_positive_b_returns_negative() {
    assertEquals(-5, arithmeticService.subtract(0, 5));
  }

  @Test
  void subtract_with_positive_a_and_zero_b_returns_a() {
    assertEquals(5, arithmeticService.subtract(5, 0));
  }

  @Test
  void subtract_with_both_zero_returns_zero() {
    assertEquals(0, arithmeticService.subtract(0, 0));
  }

  @Test
  void subtract_with_negative_a_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.subtract(-1, 5));
  }

  @Test
  void subtract_with_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.subtract(5, -1));
  }

  @Test
  void subtract_with_both_negative_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.subtract(-3, -5));
  }

  @Test
  void subtract_with_negative_a_and_zero_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.subtract(-1, 0));
  }

  @Test
  void subtract_with_zero_a_and_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.subtract(0, -1));
  }

  @Test
  void multiply_with_positive_numbers_returns_product() {
    assertEquals(12, arithmeticService.multiply(4, 3));
  }

  @Test
  void multiply_with_zero_a_and_positive_b_returns_zero() {
    assertEquals(0, arithmeticService.multiply(0, 5));
  }

  @Test
  void multiply_with_positive_a_and_zero_b_returns_zero() {
    assertEquals(0, arithmeticService.multiply(5, 0));
  }

  @Test
  void multiply_with_both_zero_returns_zero() {
    assertEquals(0, arithmeticService.multiply(0, 0));
  }

  @Test
  void multiply_with_one_a_and_positive_b_returns_b() {
    assertEquals(5, arithmeticService.multiply(1, 5));
  }

  @Test
  void multiply_with_positive_a_and_one_b_returns_a() {
    assertEquals(5, arithmeticService.multiply(5, 1));
  }

  @Test
  void multiply_with_negative_a_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.multiply(-1, 5));
  }

  @Test
  void multiply_with_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.multiply(5, -1));
  }

  @Test
  void multiply_with_both_negative_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.multiply(-3, -5));
  }

  @Test
  void multiply_with_negative_a_and_zero_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.multiply(-1, 0));
  }

  @Test
  void multiply_with_zero_a_and_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.multiply(0, -1));
  }

  @Test
  void multiply_with_large_numbers_returns_max_value() {
    assertEquals(Long.MAX_VALUE, arithmeticService.multiply(50000, 50000));
  }

  @Test
  void multiply_with_max_value_and_two_returns_max_value() {
    assertEquals(Long.MAX_VALUE, arithmeticService.multiply(Long.MAX_VALUE, 2));
  }

  @Test
  void divide_with_a_greater_than_b_returns_quotient() {
    assertEquals(5, arithmeticService.divide(10, 2));
  }

  @Test
  void divide_with_equal_numbers_returns_one() {
    assertEquals(1, arithmeticService.divide(5, 5));
  }

  @Test
  void divide_with_a_less_than_b_returns_zero() {
    assertEquals(0, arithmeticService.divide(2, 5));
  }

  @Test
  void divide_with_zero_a_returns_zero() {
    assertEquals(0, arithmeticService.divide(0, 5));
  }

  @Test
  void divide_with_one_b_returns_a() {
    assertEquals(10, arithmeticService.divide(10, 1));
  }

  @Test
  void divide_with_negative_a_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(-1, 5));
  }

  @Test
  void divide_with_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(5, -1));
  }

  @Test
  void divide_with_both_negative_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(-3, -5));
  }

  @Test
  void divide_with_zero_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(5, 0));
  }

  @Test
  void divide_with_negative_a_and_zero_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(-1, 0));
  }

  @Test
  void divide_with_zero_a_and_negative_b_throws_illegal_argument_exception() {
    assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(0, -1));
  }
}
