package com.DSA.arrays;

public class array_from_permutation {
    static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int n= arr.length;
        int[] ans =new int[7];

        for(int i=0; i<n; i++){
            ans[i]=arr[arr[i]];
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i]);
        }

    }
}
