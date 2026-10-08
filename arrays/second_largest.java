package com.DSA.arrays;

public class second_largest {
    static void main(String[] args) {
        int[] nums ={1,2,3,4,6,5};
        int max = Integer.MIN_VALUE;
        int second_max = max;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                second_max=max;
                max=nums[i];
            }
            else if(nums[i]>second_max && nums[i]!=max){
                second_max =nums[i];
            }
        }

        System.out.println(max);
        System.out.println(second_max);
    }
}
