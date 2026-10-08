package com.DSA.arrays;

import java.util.Arrays;

public class two_sum {
    static void main(String[] args) {
        int arr[] = {3,2,4,8,6,7,1};
        int r = arr.length-1;
        int l = 0;
        int target = 5;
        Arrays.sort(arr);
        while(l<r){

            int sum =arr[l]+arr[r];
            if(sum==target){
                //System.out.println(Arrays.toString(new int[] {l,r}));
                System.out.println("["+l+" "+r+"]");
                break;
            } else if (sum<target) {
                l++;
            } else if (sum>target) {
                r--;
            }

        }
    }
}
