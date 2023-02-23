package com.codingpattern.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q9QuadrapleSumToTargetTest {

    @Test
    void searchQuadraplets1() {
        Q9QuadrapleSumToTarget obj = new Q9QuadrapleSumToTarget();
        List<List<Integer>> actual = obj.searchQuadraplets(new int[] { 4, 1, 2, -1, 1, -3 }, 1);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-3, -1, 1, 4),
                Arrays.asList(-3, 1, 1, 2)
        );
        assertEquals(expected, actual);
    }

    @Test
    void searchQuadraplets2() {
        Q9QuadrapleSumToTarget obj = new Q9QuadrapleSumToTarget();
        List<List<Integer>> actual = obj.searchQuadraplets(new int[] { 2, 0, -1, 1, -2, 2 }, 2);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, 0, 2, 2),
                Arrays.asList(-1, 0, 1, 2)
        );
        assertEquals(expected, actual);
    }
}