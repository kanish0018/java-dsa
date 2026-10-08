package com.DSA.basic_problems;

import java.util.Scanner;

public class customer_details {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();   // will only read two input ..int and one string only
        String add =sc.nextLine();     // nextline consider enter as an input


        System.out.println(pin+" "+name+" "+add);

    }
}
