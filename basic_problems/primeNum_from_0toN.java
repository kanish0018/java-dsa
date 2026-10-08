package com.DSA.basic_problems;

import java.util.Scanner;

public class primeNum_from_0toN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean f = true;

        for(int i=1; i<num; i++){
            for(int j=2;j*j<=i; j++){
                if(i%j==0){
                    System.out.print("");
                }
                else System.out.println(j);
            }
        }

    }
}
