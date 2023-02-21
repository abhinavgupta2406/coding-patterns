package com.codingpattern.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q8DutchNationalFlagProblemTest {

    @Test
    void sort1() {
        Q8DutchNationalFlagProblem obj = new Q8DutchNationalFlagProblem();
        int[] actual = obj.sort(new int[]{1, 0, 2, 1, 0});
        int[] expected = new int[]{0,0,1,1,2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sort2() {
        Q8DutchNationalFlagProblem obj = new Q8DutchNationalFlagProblem();
        int[] actual = obj.sort(new int[]{2, 2, 0, 1, 2, 0});
        int[] expected = new int[]{0,0,1,2,2,2};
        assertArrayEquals(expected, actual);
    }
}