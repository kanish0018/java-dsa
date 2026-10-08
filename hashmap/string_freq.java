package com.DSA.hashmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class string_freq {
    static void main(String[] args) {
        String str="aaa aaa   aaa  fff fff xfx xfx ";
        String[] strArray = str.split("\\s+"); // s is for space
        Map<String,Integer>map = new HashMap<String,Integer>();
        for(String st : strArray){
            map.put(st , map.getOrDefault(st,0)+1);
        }
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            System.out.println(entry);
        }
        int max=Integer.MIN_VALUE;
        String word ="";
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(max< entry.getValue()){
                max= entry.getValue();
                word= entry.getKey();
            }
        }

        System.out.println(word +" "+ max);

    }
}
