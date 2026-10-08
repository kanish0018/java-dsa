package com.DSA.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class freq_check {
    static <Set> void main(String[] args) {
        int[] arr ={1234,1234,1236,3456,8790};
        Map<Integer ,Integer> map = new HashMap<Integer,Integer>();
        for(int n:arr){
            int old = map.getOrDefault(n,0);
            map.put(n,old+1);
        }
        java.util.Set<Map.Entry<Integer, Integer>> entrySet=map.entrySet();
        for(Map.Entry<Integer,Integer> entry: entrySet){

        }
    }
}
