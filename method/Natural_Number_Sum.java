package com.DSA.method;

import java.util.Scanner;

public class Natural_Number_Sum {
    public static int sum(int x){
        if(x>0) return  x+sum(x-1);
return 0;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
