package com.DSA.arrays;

import java.util.Arrays;

public class compressor {
    static void main(String[] args) {
        char[] arr ="abbbbbccccdddde".toCharArray();
        int i=0;
        int j=0;
        int count=0;

//        for(int j=0; j<arr.length; j++){
//            count=0;
//            if(arr[j]==arr[i] ){
//               i++;
//               arr[i]=(char)count;
//                count++;
//            }
//            else{
//                arr[i + 1] = (char) (count + '0');
//                i = i + 2;
//                arr[i] = arr[j];
//                count = 1;
//            }
//            arr[i + 1] = (char) (count + '0');
//            //System.out.println(count);
//        }
        StringBuilder sb = new StringBuilder();
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                sb.append(arr[i]);
                if(count>1) sb.append(count);
                count=1;
                i = j;
            }
            else {
                count++;
            }
            j++;
        }
        sb.append(arr[i]);
        if (count>1) sb.append(count);

        System.out.println(sb);
        for(int k=0; k<sb.length(); k++){
            arr[k]=sb.charAt(k);                //sb to array convert
        }

        System.out.println(Arrays.toString(arr));

    }
}
