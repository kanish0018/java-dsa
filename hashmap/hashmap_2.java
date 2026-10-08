package com.DSA.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap_2 {
    static void main(String[] args) {
        int[] arr ={1234,1234,1236,3456,8790};
        Map<Integer ,Integer>map = new HashMap<Integer,Integer>();
        map.put(100,1);
        map.put(200 , 2);

        System.out.println(map.containsKey(100)); // inbuild methods
        System.out.println(map.containsKey(1));
        System.out.println(map.getOrDefault(100,0));
        int x= map.get(100);

        Collection<Integer> c =map.values();
        Set<Integer> vr = map.keySet();
    }
}
