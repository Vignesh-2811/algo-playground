package com.shakthi.leetcode.dailychallenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNUniqueIntegersSumUpToZeroTest {

    @Test
    void TestOddNum() {
        FindNUniqueIntegersSumUpToZero solver = new FindNUniqueIntegersSumUpToZero();

        int[] result = solver.sumZero(5);

        assertEquals(5, result.length);
        assertEquals(0, Arrays.stream(result).sum());
    }

    @Test
    void TestEvenNum() {
        FindNUniqueIntegersSumUpToZero solver = new FindNUniqueIntegersSumUpToZero();

        int[] result = solver.sumZero(10);

        assertEquals(10, result.length);
        assertEquals(0, Arrays.stream(result).sum());
    }

    @Test
    void TestZero() {
        FindNUniqueIntegersSumUpToZero solver = new FindNUniqueIntegersSumUpToZero();

        int[] result = solver.sumZero(0);

        assertEquals(1, result.length);
        assertEquals(0, Arrays.stream(result).sum());
    }
}
