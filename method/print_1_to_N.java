package com.DSA.method;

public class print_1_to_N {
    public static void print(int n){
        System.out.println(n);  //for printing 10 to 1
        if(n>1) print(n-1);
        //System.out.println(n); ...for printing from 1 to 10

    }

    public static void main(String[] args) {
        print(10);
    }
}
