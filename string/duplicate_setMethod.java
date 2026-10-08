package com.DSA.string;

import java.util.HashSet;
import java.util.Set;

public class duplicate_setMethod {
    public static  boolean isUnique(String str){
        boolean f = true;
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<str.length(); i++){
            if(set.contains(str.charAt(i))){
                f=false;
                break;
            }
            set.add(str.charAt(i));
        }
        return f;
    }
    static void main(String[] args) {
        String str = "kanish";
        System.out.println(isUnique(str));

    }
}
