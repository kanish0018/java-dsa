package com.DSA.basic_problems;

import java.util.Scanner;

public class series_4 {
    // 1+ 1/2 + 1/3 + 1/4
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            sum=sum+(1.0/i);
        }
        System.out.println(sum);
    }

}
