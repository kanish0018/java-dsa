package com.DSA.arrays;
import java.util.Arrays;

public class move_zeroes {
    static void main(String[] args) {
        int arr[] = {0, 0, 2, 0, 0, 0, 3};
        int i = -1;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
