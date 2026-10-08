package com.DSA.arrays;
import java.util.Arrays;
// to find second max
public class array_sort {
    static void main(String[] args) {
        int arr[] ={1,2,3,2,4};

        int second_max=-1;
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-2; i>=0; i--){
            if(max!=arr[i]){
                second_max=arr[i];
                break;

            }
        }
        System.out.println(second_max);

    }
}
