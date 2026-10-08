package com.DSA.arrays;

import java.util.Scanner;

public class freq_check {
    public static void main(String arg[]){
        int[] freq = new int[10];
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while(n>0){
            int digit=n%10;
            freq[digit] = freq[digit]+1;//freq[digit]++
            n=n/10;
        }
        for(int i=0; i<10; i++){
            if(freq[i]>0) {
                System.out.println(i + " : " + freq[i]);
            }
        }
    }
}
