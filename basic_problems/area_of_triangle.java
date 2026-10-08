package com.DSA.basic_problems;


import java.util.Scanner;

public class area_of_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5*base*height;
        System.out.printf("%.2f",area);

    }
}
