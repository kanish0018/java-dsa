package com.DSA.basic_problems;

import java.util.Scanner;

public class power_of_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int x = sc.nextInt();


//        for(int i=1; i<=x; i++){
//            if((Math.pow(2,i))==x){
//                System.out.println("yes");
//            }
//        }
      //using bit manupluation
        //using log
        //1e-10
int n=17;
double d = Math.log(n)/Math.log(3);
        System.out.println(d-(int)d<1e-10);
    }
}

