package com.DSA.arrays;

public class min_max {
    static void main(String[] args) {
        int[] ar={1,2,3,4,5,6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("min. value "+min);
        System.out.println("max. value "+max);
    }
}
