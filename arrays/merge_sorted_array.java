package com.DSA.arrays;

import java.util.Arrays;

public class merge_sorted_array {
    static void main(String[] args) {
        int[] arr1 ={1,3,5,9};
        int[] arr2 ={2,4,5,6,7,8,9};
        int[] arr3 =new int[arr1.length+arr2.length];
        int i=0;//for arr1
        int j=0;//for arr2
        int p=0;//for arr3
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[p] = arr1[i];
                i++;
                p++;
            } else if (arr1[i] > arr2[j]) {
                arr3[p] = arr2[j];
                j++;
                p++;
            } else {
                arr3[p]=arr1[i];
                i++;
                p++;

                arr3[p]=arr2[j];
                j++;
                p++;
            }
        }

        while(i<arr1.length){
            arr3[p] = arr1[i];
            i++;
            p++;
        }

        while(j<arr2.length){
            arr3[p] = arr2[j];
            j++;
            p++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
