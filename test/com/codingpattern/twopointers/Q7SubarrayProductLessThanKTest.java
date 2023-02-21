package com.codingpattern.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q7SubarrayProductLessThanKTest {

    @Test
    void findSubarrays1() {
        Q7SubarrayProductLessThanK obj = new Q7SubarrayProductLessThanK();
        List<List<Integer>> actual = obj.findSubarrays(new int[]{2, 5, 3, 10}, 30);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(5),
                Arrays.asList(2,5),
                Arrays.asList(3),
                Arrays.asList(5,3),
                Arrays.asList(10)
        );
        assertEquals(expected, actual);
    }

    @Test
    void findSubarrays2() {
        Q7SubarrayProductLessThanK obj = new Q7SubarrayProductLessThanK();
        List<List<Integer>> actual = obj.findSubarrays(new int[]{8, 2, 6, 5}, 50);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(8),
                Arrays.asList(2),
                Arrays.asList(8,2),
                Arrays.asList(6),
                Arrays.asList(2,6),
                Arrays.asList(5),
                Arrays.asList(6,5)
        );
        assertEquals(expected, actual);
    }
}