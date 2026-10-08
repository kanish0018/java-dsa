package com.DSA.basic_problems;

import java.util.Scanner;

public class power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//1^2 + 2^2 + 3^2
        int sum =0;
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            sum=sum+(i*i);
        }
        System.out.println(sum);
    }
}
