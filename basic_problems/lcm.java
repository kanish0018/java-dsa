package com.DSA.basic_problems;

import java.util.Scanner;

public class lcm {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int max=Math.max(a,b);
        while(true){
            if((max%a==0)&&(max%b==0)){
                System.out.println(max);
                break;
            }
            max++;
        }

    }
}
