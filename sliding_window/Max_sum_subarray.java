package com.DSA.sliding_window;

public class Max_sum_subarray {
    public static void main(String[] args) {
         int[] arr = {2, 1, 5, 1, 3, 2};
         int k =3;


         int sum =0;
         for(int i=0; i<k; i++){
             sum += arr[i];
         }

         double max =sum;

         for(int i=k; i<arr.length; i++){
             sum += arr[i];
             sum = sum-arr[i-k];
             max=Math.max(max,sum);
         }
         double avg = max/k;

        System.out.printf("%.2f",avg);


    }
}
