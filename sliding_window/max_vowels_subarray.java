package com.DSA.sliding_window;

public class max_vowels_subarray {
    static void main(String[] args) {
        String s ="abciiidef";
        s=s.toLowerCase();
        char arr[] =s.toCharArray();
        int k=3;
        boolean[] isvowel = new boolean[128];
        isvowel['a']=true;
        isvowel['e']=true;
        isvowel['i']=true;
        isvowel['o']=true;
        isvowel['u']=true;
        int count =0;

        //bruteforce approach
//        int n=s.length();
//        int w=3;
//        String[] ar = new String[n-w+1];
//        for(int i=0; i<n; i++){
//            for(int j=i; j<n; j++){
//                for(int k=i; k<=j; k++){
//                    String ss =s.substring(i,j+1);
//                    if(j-i+1==w) System.out.println(ss);
//                }
//            }
//        }

        //sliding windows
        for(int i=0; i<k; i++){

            //char ch = s.charAt(i);
            if(isvowel[arr[i]]){
                count++;
            }
            if(count==k){
                break;
            }
        }
        int maxcount=count;

        for(int i=k; i<arr.length; i++){

            if(isvowel[arr[i]]){
                count++;
            }
            if(isvowel[arr[i-k]]){
                count--;
            }

            maxcount=Math.max(count,maxcount);
            if(maxcount==k){
                break;
            }

        }

        System.out.println(maxcount);


        }

    }

