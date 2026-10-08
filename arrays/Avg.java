package com.DSA.arrays;

import java.util.Scanner;

public class Avg {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5};

        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        double avg =sum/arr.length;
        System.out.printf("%.2f",avg);
    }
}
