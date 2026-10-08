package com.DSA.arrays;

public class linear_search {
    static void main(String[] args) {
        int arr[]={10,20,30,40,30,60};
        int target=5;
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("found at"+" "+i);
                index++;
                break;
            }
        }
        if(index==-1){System.out.println("not found");}
    }
}
