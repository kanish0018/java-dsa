package com.DSA.method;

public class Digits_Count {
    public static int digit(int x){
        if(x>0) return 1+digit(x/10);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(digit(1045));
    }

}
