package com.DSA.code_force;

import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int count =0;
         while(n>0){

             int n1=sc.nextInt();
             int n2=sc.nextInt();
             int n3=sc.nextInt();

             if(n1+n2+n3 > 1){
                 count++;
             }
             n--;
         }
        System.out.println(count);

    }
}
