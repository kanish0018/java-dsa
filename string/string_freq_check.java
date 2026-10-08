package com.DSA.string;

import java.util.Scanner;

public class string_freq_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int[] freq =new int[128]; // 128 can cover all letter in keyboard
//        for(int i=0; i<str.length(); i++){
//            freq[str.charAt(i)]++;
//        }
        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);
            freq[ch]++;
        }
       for(int i=0; i<str.length(); i++){
           char ch =str.charAt(i);
//           if(freq[ch]!=0){
//               System.out.println(ch + " : " +freq[ch]);     // for freq check
//               freq[ch]=0;
//           }
           if(freq[ch]==1){
               System.out.println(ch);   //for first unique character
               break;
           }

       }

    }
}
