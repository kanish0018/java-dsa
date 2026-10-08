package com.DSA.basic_problems;

import java.util.Scanner;

public class series_5 {
    static void main(String[] args) {
        //2^1 + 2^2 + 2^3
        Scanner sc = new Scanner(System.in);
        double sum=0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            sum=sum+(Math.pow(2,i));
        }
        System.out.println(sum);

    }
}
