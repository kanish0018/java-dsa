package com.DSA.method;

public class recursion {
    static int x=1;
    public static void m1(){
        System.out.println(x);
        x++;
        if(x<5){
            m1();
        }
        System.out.println(x);
    }

    public static void m2(int y){
        System.out.println(y);
        if(y<5){
            m2(y+1);
        }
        System.out.println(y);
    }


    public static void main(String[] args) {
        m2(1);
    }
}
