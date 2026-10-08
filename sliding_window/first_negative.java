package com.DSA.sliding_window;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class first_negative {
    static void main(String[] args) {
        int []arr ={-8, 2, 3, -6, 10};
        int k=2;
        Deque<Integer> dq =new ArrayDeque<>();
        //for add --> add first , add last
        //for remove --> poll
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<k; i++){
            if(arr[i]<0){
                dq.add(arr[i]);
            }
        }

        for(int i=k; i<arr.length-k; i++){
            if(arr[i]<0){
                list.add(arr[i]);
                break;
            }

            list.remove(arr[i-k]);

        }

        System.out.println(list);
    }
}
