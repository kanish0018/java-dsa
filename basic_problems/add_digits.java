package com.DSA.basic_problems;

public class add_digits {
    static void main(String[] args) {
        int n=38;

        while(n>=10){
            int sum=0;
            while(n>0){
                sum += n % 10;
                n=n/10;
            }
            sum=n;

        }
        System.out.println(n);
    }
}
