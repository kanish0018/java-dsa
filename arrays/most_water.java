package com.DSA.arrays;

public class most_water {
    static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r=arr.length-1;
        int max_water=0;
        while(l<r){
            int width = r-l;
            int h = Math.min(arr[l],arr[r]);
            int area = width *h;
            max_water=Math.max(max_water,area);
            if(arr[l]<arr[r]){
                l++;
            }
            else r--;
        }
        System.out.println(max_water);
    }
}
