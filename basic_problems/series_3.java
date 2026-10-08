package com.DSA.basic_problems;

import java.util.Scanner;

public class series_3 {
    static void main(String[] args) {
        //1-2+3-4+5-6
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n=sc.nextInt();
        for(int i=0; i<=n;i++){
            if(i%2==0){
                sum=sum-i;
            }
            else sum=sum+i;

        }
        System.out.println(sum);

    }
}
