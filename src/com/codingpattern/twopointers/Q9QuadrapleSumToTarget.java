package com.codingpattern.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q9QuadrapleSumToTarget {
    public List<List<Integer>> searchQuadraplets(int[] arr, int target) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j-1]) {
                    continue;
                }

                int first = i;
                int second = j;
                int left = second + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[first] + arr[second] + arr[left] + arr[right];
                    if (sum == target) {
                        output.add(Arrays.asList(arr[first], arr[second], arr[left], arr[right]));
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }

                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return output;
    }
}
