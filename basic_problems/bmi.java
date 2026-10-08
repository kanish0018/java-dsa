package com.DSA.basic_problems;

import java.util.Scanner;

public class bmi {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height  =sc.nextDouble();
        double bmi = weight/(height*height);
        if(bmi<18.5){
            System.out.println("underweight");
        } else if (bmi<=24.9) {
            System.out.println("normal");

        } else if (bmi<=29.9) {
            System.out.println("overweight");
        }
        else System.out.println("obese");

    }
}
