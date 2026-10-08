package com.DSA.code_force;

import java.util.Scanner;

public class watermalon {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();

        if(num>2 && num%2==0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
