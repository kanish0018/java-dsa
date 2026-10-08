package com.DSA.arrays;

import java.util.Arrays;

public class remove_number {
    static void main(String[] args) {
        int[] arr ={1,1,2,3};
        int i=0;
        int target =1;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=target){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(i+1);
        System.out.println(Arrays.toString(arr));
    }
}
