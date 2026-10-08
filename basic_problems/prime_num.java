package com.DSA.basic_problems;

import java.util.Scanner;

public class prime_num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=true;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
            f=false;
            break;
            }

        }
        System.out.println(f);
    }
}
