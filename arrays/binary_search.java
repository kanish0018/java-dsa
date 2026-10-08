package com.DSA.arrays;
import java.util.Arrays;

public class binary_search {
    static void main(String[] args) {
        //array must be sorted
        //inbuild function Arrays.binarySearch(ar,t) --> tell the position not index(i.e index starts from 0 and position from 1)
        //when element not found in array it tells at which position it can be present
        int[] arr ={1,2,3,4,5,6,7,8};
        int target=8;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid=(i+j)/2;
            if (arr[mid] ==target) {
                System.out.println("found at index " + mid);
                break;
            }

            else if(arr[mid]>target){
                j=mid-1;
            }
            else if (arr[mid]<target) {
                i=mid+1;
            }

        }

    }
}
