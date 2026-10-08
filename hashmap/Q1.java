package com.DSA.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q1 {
    static void main(String[] args) {
        String str ="24sffgriu95548ugdh7";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
