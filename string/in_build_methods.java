package com.DSA.string;
import java.util.Arrays;

public class in_build_methods {
    static void main(String[] args) {
        String str ="hello 123455 world";
        String[] ar =str.split("\\d+");
        System.out.println(Arrays.toString(ar));

        str=String.join("-",ar);
        System.out.println(str);

        str=str.replace("-"," ");


    }
}
