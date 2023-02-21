package com.codingpattern.twopointers;

import java.util.ArrayList;
import java.util.List;

public class Q7SubarrayProductLessThanK {

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> output = new ArrayList<>();
        int product = 1;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            product = product * arr[right];

            while (product >= target && left < arr.length) {
                product = product / arr[left];
                left++;
            }

            List<Integer> list = new ArrayList<>();
            for (int i = right; i >= left; i--) {
                list.add(0, arr[i]);
                output.add(new ArrayList<>(list));
            }
        }

        return output;
    }
}
