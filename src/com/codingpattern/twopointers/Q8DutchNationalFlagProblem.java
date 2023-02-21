package com.codingpattern.twopointers;

// Values <= 0 will be below low
// Values >= 2 will be above high
// Values == 1 will be between low and high
public class Q8DutchNationalFlagProblem {
    public int[] sort(int[] arr) {
        int low = 0, high = arr.length - 1;

        for (int i = 0; i <= high;) {
            if(arr[i] == 0) {
                swap(arr, i, low);
                i++;
                low++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, high);
                high--;
            }
        }

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int val = arr[i];
        arr[i] = arr[j];
        arr[j] = val;
    }
}
