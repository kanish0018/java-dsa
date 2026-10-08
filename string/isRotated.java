package com.DSA.string;

public class isRotated {
    static void main(String[] args) {
        String str = "abcd";
        String str2="dabc"; // is str2 is rotated of str?
        str=str+str;
        if(str.indexOf(str2)>0){
            System.out.println("yes rotated");
        }
        else System.out.println("not rotated");

    }
}
