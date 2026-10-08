package com.DSA.basic_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class prime_factor {
    public static boolean isPrime(int n) {
        boolean f = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                f = false;
                break;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list =new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            if(isPrime(i)){
                list.add(i);
            }


        }
        System.out.println(list);
    }
}
