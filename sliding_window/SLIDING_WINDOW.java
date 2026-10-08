package com.DSA.sliding_window;

import java.util.Arrays;

public class SLIDING_WINDOW {
     public static void main(String[] args) {
         int arr[] ={1,2,3,4};
         int len = arr.length;
         int w=3;

         //bruteforce

//         for(int i=0; i<len; i++){
//             int sum=0;
//             for(int j=i; j<len; j++){
//                 sum =sum+arr[j];
//                 if(j-i+1==w){ //used for windows size
//                     System.out.println(sum);
//                     break;
//                 }
//             }
//         }

         //sliding
         double[] result =new double[len-w+1];
         double sum=0;
         int index=0;
         int left =0;
         int right = 0;
         while(right<w){
             sum=sum+arr[right];
             right++;
         }
         result[index++]=sum/w; //for average

         while(right<len){
             sum=sum+arr[right];
             sum=sum-arr[left];
             result[index++]=sum/w;
             left++;
         }

         System.out.println(Arrays.toString(result));



    }
}
