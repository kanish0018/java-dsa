package com.DSA.string;

import java.util.Scanner;

public class frequency_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //str=str.toLowerCase();
        //int[] arr = new int[128];
       for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);
           int count =1;

           boolean visited = false;

           for(int j=0; j<i;j++) {
               if (str.charAt(j) == ch) {
                   visited = true;
                   break;
               }
           }

if(visited) {
    continue;
}
               for(int k=i+1; k<str.length(); k++){
                   if(str.charAt(k)==ch){
                       count++;
                   }
               }

               System.out.println(ch + "=" +count);

           }
       }

    }

