package com.DSA.string;

public class reverse {
    static void main(String[] args) {
        String str ="madam";
        String result ="";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            result+=ch;
        }
//        System.out.println(result);
//        char[] ar=str.toCharArray();
//        int i=0;
//        int j=ar.length-1;
//        while(i<j){
//            char temp = ar[i];
//            ar[i]=ar[j];
//            ar[j] =temp;
//            i++;
//            j--;
//
//        }

if(result.equals(str)){
    System.out.println("palindrome");
}
else System.out.println("not palindrome");
        //System.out.println(ar);
    }
}
