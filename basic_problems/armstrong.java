package com.DSA.basic_problems;

import java.util.Scanner;

public class armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        while(a!=0){
            int digit = a%10;
            int cube=digit*digit*digit;
            sum = sum +cube;
            a=a/10;
        }
        if(sum==temp){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
