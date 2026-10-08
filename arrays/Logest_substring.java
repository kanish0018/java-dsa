package com.DSA.arrays;

public class Logest_substring {
    static void main(String[] args) {
        int maxLength = 0;
String s = "abcabcbb";
        for (int i = 0; i < s.length(); i++) {

            boolean[] seen = new boolean[256];

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);


                if (seen[ch]) {
                    break;
                }

                seen[ch] = true;

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        System.out.println(maxLength);

    }
}
