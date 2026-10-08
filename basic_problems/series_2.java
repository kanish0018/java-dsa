package com.DSA.basic_problems;

import java.util.Scanner;

public class series_2 {
    static void main(String[] args) {
        // 1^3 + 2^3 + 3^3 + 4^3
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n= sc.nextInt();
        for(int i=0; i<=n; i++){
            sum=sum+(i*i*i);

        }
        System.out.println(sum);
    }
}
