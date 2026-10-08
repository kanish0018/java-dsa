package com.DSA.basic_problems;

import java.util.Scanner;

public class quardratic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c = sc.nextDouble();

        double D = Math.sqrt((b*b)-4*a*c);

        double x1 =  ((-b)+D)/(2*a);
        double x2 = ((-b)-D)/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
