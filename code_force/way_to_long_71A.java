package com.DSA.code_force;

import java.util.Scanner;

public class way_to_long_71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String str = sc.next();

            if (str.length() > 10) {
                StringBuilder sb = new StringBuilder();

                sb.append(str.charAt(0));
                sb.append(str.length() - 2);
                sb.append(str.charAt(str.length() - 1));

                System.out.println(sb.toString());
            } else {
                System.out.println(str);
            }
        }

        sc.close();
    }
}
