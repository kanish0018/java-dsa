package com.DSA.arrays;

import java.util.HashMap;

public class fruitsIntoBasket {
    static void main(String[] args) {

        int fruit[]={1,2,1,2,1,3,1,2,1,1,2,1,4,1};
        int n=fruit.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int left =0;
        int max=0;
        int right =0;
       while(right<n){
           map.put(fruit[right],map.getOrDefault(fruit[right],0)+1);
           while(map.size()>2){
               map.put(fruit[left], map.getOrDefault(fruit[left],0)-1);
               if(map.get(fruit[left])==0){
                   map.remove(fruit[left]);
               }
               left++;
               right++;
           }
           max=Math.max(max,right-left+1);
       }
        System.out.println(max);
    }
}
