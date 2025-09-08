package com.shakthi.leetcode.dailychallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GetNoZeroIntegersTest {

    private final GetNoZeroIntegers solver = new GetNoZeroIntegers();

    @Test
    void testSmallestValidInput() {
        int[] result = solver.getNoZeroIntegers(2);
        assertEquals(2, result.length);
        assertEquals(2, result[0] + result[1]);
        assertFalse(containsZero(result[0]));
        assertFalse(containsZero(result[1]));
    }

    @Test
    void testNormalCase() {
        int[] result = solver.getNoZeroIntegers(11);
        assertEquals(2, result.length);
        assertEquals(11, result[0] + result[1]);
        assertFalse(containsZero(result[0]));
        assertFalse(containsZero(result[1]));
    }

    @Test
    void testLargerNumber() {
        int[] result = solver.getNoZeroIntegers(101);
        assertEquals(2, result.length);
        assertEquals(101, result[0] + result[1]);
        assertFalse(containsZero(result[0]));
        assertFalse(containsZero(result[1]));
    }

    @Test
    void testAnotherNumber() {
        int[] result = solver.getNoZeroIntegers(69);
        assertEquals(2, result.length);
        assertEquals(69, result[0] + result[1]);
        assertFalse(containsZero(result[0]));
        assertFalse(containsZero(result[1]));
    }

    @Test
    void testNoSolutionCase() {
        // There is always a valid decomposition for n >= 2 per the problem statement
        // so this should never return empty.
        int[] result = solver.getNoZeroIntegers(500);
        assertNotEquals(0, result.length);
    }

    private boolean containsZero(int num) {
        return String.valueOf(num).contains("0");
    }
}
