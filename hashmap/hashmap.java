package com.DSA.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class hashmap {
    static void main(String[] args) {
        Map<String ,Integer> map = new LinkedHashMap<String, Integer>();  //String key and Integer value
        //key is unique and does;nt repeat
        //for random order use hashmap ... order is according to key .
        //for sequence order use Linked hashmap like inputed
        //for sorted order use tree hashmap

        map.put("A",1);
        map.put("Z",1);
        map.put("F",2);
        map.put("G",2);//consider this A or key
        System.out.println(map);
        System.out.println(map.getOrDefault("Z",0));

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
