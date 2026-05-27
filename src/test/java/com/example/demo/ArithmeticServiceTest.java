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
    void add_with_max_value_and_one_throws_illegal_argument_exception() {
        assertThrows(IllegalArgumentException.class,
            () -> arithmeticService.add(Integer.MAX_VALUE, 1));
    }

    @Test
    void add_with_max_value_and_near_max_throws_illegal_argument_exception() {
        assertThrows(IllegalArgumentException.class,
            () -> arithmeticService.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
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
}
