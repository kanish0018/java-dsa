package com.DSA.algorithms;

public class kadanes {
    static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,-2,1,-5,4};

        int max =arr[0];
        int cur =arr[0];
        int end =0;
        int start=0;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>cur+arr[i]){
                cur=arr[i];
                start=i;
            }
            //cur=Math.max(arr[i],cur+arr[i]);
            else{
                cur=cur+arr[i];
            }
            //max=Math.max(max,cur);
            if(max<cur){
                max=cur;
                end=i;
            }
        }
        System.out.println(max);
        System.out.println(start);
        System.out.println(end);

    }
}
