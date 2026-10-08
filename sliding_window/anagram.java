package com.DSA.sliding_window;

import java.util.Arrays;

public class anagram {
    static void main(String[] args) {
        String s= "cbaebabacd";
        String p="abc";
int[] freq_p =new int[128];
int[] freq_s =new int[128];

        int k=p.length();
        int left =0;
        int right =0;
        int count=0;

        for(int i=0; i<k; i++){
            freq_p[p.charAt(i)]++;
            freq_s[s.charAt(i)]++;
        }
        if(Arrays.equals(freq_s,freq_p)){
            count++;
        }

        for(int i=k; i<s.length(); i++){
            freq_s[s.charAt(i)]++;
            freq_s[s.charAt(i-k)]--;
            if(Arrays.equals(freq_s,freq_p)){
                count++;
            }
        }
        System.out.println(count);

//        //for freq array for anagram check
//        while(right<k){
//            freq_p[p.charAt(right)]++;
//            freq_s[s.charAt(right)]++;
//            right++;
//        }
//        if(Arrays.equals(freq_p ,freq_s)) count++;
////for first three windows
////        String result ="";
////        while(right<k){
////            result =result+s.charAt(right);
////            right++;
////        }
//
//
//        while(right<s.length()){
//            freq_s[s.charAt(right)]++;
//            freq_s[s.charAt(left)]--;
//            if(Arrays.equals(freq_p,freq_s)) count++;
//            left++;
//        }
//
//        System.out.println(count);
//       while(right<s.length()){
//           result=result+s.charAt(right);
//           result=result.substring(1);
//          System.out.println(result);
//          right++;
//        }
    }
}
