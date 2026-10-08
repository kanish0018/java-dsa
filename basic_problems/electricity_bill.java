package com.DSA.basic_problems;

import java.util.Scanner;

public class electricity_bill {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit=sc.nextInt();
        int bill=0;
        if(unit<=100){
            bill=1*unit;

        } else if (unit>100&&unit<=200) {
            bill =100+((unit-100)*2);

        } else {
            bill=300+((unit-200)*3);

        }

        System.out.println(bill);

    }
}
