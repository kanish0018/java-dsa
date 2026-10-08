package com.DSA.sliding_window;

import java.util.Arrays;

public class difuse_bomb {
    static void main(String[] args) {
        int arr[] ={5,7,1,4};
        int k=3;
        int ans[] = new int[arr.length];

        int n =arr.length;
        for(int i=0; i<arr.length; i++){

            if(k>0){
                int sum=0;
                for(int j=1; j<=k; j++){
                    sum+=arr[(i+j)%n];
                }
                ans[i]=sum;
            }

            else{
                int sum=0;
                for(int j=1; j<=k; j++){
                    sum = sum + arr[(i-j+n)%n];
                }
                ans[i]=sum;
            }

        }
        System.out.println(Arrays.toString(ans));

    }
}
