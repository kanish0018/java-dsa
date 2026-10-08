package com.DSA.sliding_window;

public class distinct_character_substring {
    static void main(String[] args) {
        String s ="abciiidef";
        char arr[] =s.toCharArray();
        int k=3;
        int count=1;

        for(int i=0; i<s.length()-3; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if(a!=b && b!=c && a!=c){
                count++;
            }
        }

        System.out.println(count);

    }
}
