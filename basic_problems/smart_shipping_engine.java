package com.DSA.basic_problems;

import java.util.Scanner;

public class smart_shipping_engine {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String Destination = sc.next();
double weight = sc.nextDouble();
boolean express = sc.nextBoolean();
double amt = sc.nextDouble();
double fees =0 ;
if (Destination.equalsIgnoreCase("domestic")){
    if(amt>=100){
        fees = amt;

    } else if (amt<100) {
        if(weight<=2){
            fees =5;
        } else if (weight>2) {
            fees =5+(2*(weight-2));
        }

    }
    if (express) {
        fees=fees+8;
    }
    System.out.println(fees);

}

if(Destination.equalsIgnoreCase("international")){
    if(weight<=5){
        fees = 25;
    } else if (weight>5) {
        fees = fees+(5*(weight-5));

    }
    if(express){
        fees =fees+20;
    }
    System.out.println(fees);
}
    }
}
