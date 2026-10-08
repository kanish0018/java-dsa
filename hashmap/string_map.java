package com.DSA.hashmap;

import java.util.HashMap;
import java.util.Map;

public class string_map {
    static void main(String[] args) {
        String s = "hello my name is kanish";
        Map<String,Integer> map = new HashMap<String,Integer>();

        String[] ar= s.split("//s+");
        for(int i=0; i<ar.length; i++){
            map.put(ar[i], map.getOrDefault(ar[i],0)+1);
        }
        System.out.println(map);
    }
}
