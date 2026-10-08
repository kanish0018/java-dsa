package com.DSA.arrays;

public class contain_duplicates {
    static void main(String[] args) {
        int []nums={1,2,3,1};
        int k=3;
        boolean n =false;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j] && Math.abs(j-i)<=k){
                    n=true;
                    break;
                }

            }
        }
        System.out.println(n);
    }
}
