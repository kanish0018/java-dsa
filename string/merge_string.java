package com.DSA.string;

public class merge_string {
    static void main(String[] args) {
//alternative merge

        String s1 = "abcdef";
        String s2 = "ijk";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        while (i<s1.length() && j<s2.length()){
            char c1 = ar1[i];
            char c2 = ar2[j];
            sb.append(c1);
            sb.append(c2);
            i++;
            j++;
        }
        while (i<s1.length()){
            sb.append(ar1[i]);
            i++;
        }

        while(j<s2.length()){
            sb.append(ar2[j]);
            j++;
        }
        System.out.println(sb);
    }
}
