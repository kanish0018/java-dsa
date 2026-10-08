package com.DSA.string;

import java.util.Scanner;

public class vowel_consonant {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();

        int vowel=0;
        int conso=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
vowel++;
            }
            else conso++;

        }
        System.out.println(vowel);
        System.out.println(conso);



    }
}
