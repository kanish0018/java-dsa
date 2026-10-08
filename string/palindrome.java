package com.DSA.string;

public class palindrome {
    static void main(String[] args) {
        String str = " m *a d a 8*m ";
//
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        System.out.println(sb.toString().equals(str)); // convert sb to string
//


        //another way

        char[] ar =str.toCharArray();
        boolean f= true;
        int i=0;
        int j=ar.length-1;
        while(i<j){
            while(i<ar.length && !Character.isLetter(ar[i])){    //skips any symbol from start
                i++;
            }
            while(j>=0 && !Character.isLetter(ar[j])){    //skips any symbol
                j--;
            }
            if(ar[i]!=ar[j]){
                f=false;
                break;
            }
            i++;
            j--;

        }
        System.out.println(f);


    }
}
