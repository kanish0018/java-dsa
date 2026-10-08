package com.DSA.arrays;

import java.util.Arrays;

public class reverse_array {
    static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
