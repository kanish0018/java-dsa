package com.DSA.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class rotate_array {
     static void reverse(int[] nums,int left ,int right){
        while(left<right){
            int temp= nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] nums = {1, 2, 3, 4, 5};
        k=k%nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

}
