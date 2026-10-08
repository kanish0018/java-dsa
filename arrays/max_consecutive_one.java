package com.DSA.arrays;

public class max_consecutive_one {
    static void main(String[] args) {
        int []nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int zeros = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == 0) {
                    zeros++;
                }


                if (zeros > k) {
                    break;
                }

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        System.out.println(maxLength);
    }
}
