package com.DSA.string;

public class Sub_string {
    static void main(String[] args) {
        String str = "kanish";
//        str =str.substring(1);
//        str=str.substring(1);
//        System.out.println(str);
         //str=str.substring(0,str.length()-1); //last ch is excluded

        for(int i=0; i<str.length();i++){
            for(int j=i; j<str.length(); j++){
                System.out.println(str.substring(i,j+1));
            }
        }

        //System.out.println(str);

    }
}
