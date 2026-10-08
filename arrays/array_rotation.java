package com.DSA.arrays;
import java.util.Arrays;

public class array_rotation {
    static void main(String[] args) {

        //1st
        int arr[]={1,2,3,4,5};
//        int k=344;
//        k=k % arr.length; // to remove duplication of rotation
//        for(int j=0;j<k;j++) {
//            int temp = arr[0];   //picks the first element
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[arr.length - 1] = temp;   //puts to end
//        }
//
//        System.out.println(Arrays.toString(arr));


        //2nd
        int i=0;
        int j=1;

        while(j<arr.length){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
