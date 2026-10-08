package com.DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class temp {
    static void main(String[] args) {
//        int x=1;
//        String s="abc";
//        boolean t =true;
//        System.out.printf("Integer:%d, String:%s,\nBoolean:%s",x,s,t);

        Scanner sc = new Scanner(System.in);
        int i =0;
        int arr[]=new int[5];
        int t = 5;
        for(int j=0; j<5; j++){
            arr[j]=sc.nextInt();
        }

        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);






//        for(int j=1; j<5; j++){
//            if(arr[j]!=arr[i]){
//                i++;
//                arr[i]=arr[j];
//            }
//        }

       for(int j=0; j<=i; j++){
           System.out.println(arr[j]);
       }
    }
}
