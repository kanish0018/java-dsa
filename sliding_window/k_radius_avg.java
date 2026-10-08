package com.DSA.sliding_window;

import java.util.Arrays;

public class k_radius_avg {
    static void main(String[] args) {
        int nums[]={7,4,3,9,1,8,5,2,6};
        int k=3;
        int result[] =new int[nums.length];
        int n=nums.length;

        Arrays.fill(result,-1);
        int w=2*k+1; //windows size

        if(k==0){
            System.out.println(Arrays.toString(nums));
        }
        if(w>n) System.out.println(Arrays.toString(nums));
        int sum=0;
        int l=0;
        int r=0;
        while(r<w){
            sum+=nums[r];
            r++;
        }
        result[k++] = (sum/w);

        while(r<n){
            sum+=nums[r];
            sum-=nums[l];
            result[k++] =sum/w;
            l++;
            r++;
        }


        System.out.println(Arrays.toString(result));



    }
}
