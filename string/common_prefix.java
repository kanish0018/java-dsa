package com.DSA.string;

import java.util.Scanner;

//brute force

public class common_prefix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"flower" ,"flow", "flight"};
        String result ="";


        String str = arr[0];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean f=true;

            for(int j=1; j<arr.length; j++){
                if(arr[j].indexOf(ch)!=i) {
                    f=false;                   // checks if ch is present in all the string ..
                                               // if its false than ch is not present any of the string
                    break;
                }
            }

            if(f){
                result+=ch;
            }
            else break;
            }
        System.out.println(result);

        }
    }

