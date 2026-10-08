package com.DSA.string;

import java.util.Scanner;

public class duplicate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int[] freq = new int[128];
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch]>1){
                System.out.println("duplicate present");
                break;
            }
        }

    }
}
