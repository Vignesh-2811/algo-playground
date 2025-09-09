package com.shakthi.leetcode.dailychallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberOfPeopleAwareOfASecretTest {

    @Test
    void testMinimumCase() {
        NumberOfPeopleAwareOfASecret sol = new NumberOfPeopleAwareOfASecret();
        assertEquals(1, sol.peopleAwareOfSecret(1, 1, 1));
    }

    @Test
    void testAllForgetBeforeEnd() {
        NumberOfPeopleAwareOfASecret sol = new NumberOfPeopleAwareOfASecret();
        assertEquals(0, sol.peopleAwareOfSecret(10, 5, 5)); // everyone forgets before day n
    }

    @Test
    void testLargeN() {
        NumberOfPeopleAwareOfASecret sol = new NumberOfPeopleAwareOfASecret();
        int result = sol.peopleAwareOfSecret(1000, 10, 20);
        assertTrue(result >= 0 && result < 1_000_000_007); // only modular constraint
    }
}
