package com.DSA.basic_problems;

import java.util.Scanner;

public class perfect_sq {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        boolean b = false;
//        for(int i=1; i*i<=x; i++){
//            if((i*i)==x){
//                b=true;                    //for no. of perfect sq. btw given num.
//                break;
//            }
//
//        }

        double d = Math.sqrt(x);
        if(d == (int) d){
            System.out.println("yes");
        }
        else System.out.println("no");

    }
}
