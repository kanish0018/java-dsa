package com.DSA.sliding_window;

import java.util.Arrays;

public class Anagram_string {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        int[] freq_p = new int[128];
        int[] freq_s = new int[128];

        int k = p.length();

        int left = 0;
        int right = 0;
        int count = 0;


        while (right < k) {
            freq_p[p.charAt(right)]++;
            freq_s[s.charAt(right)]++;
            right++;
        }

        if (Arrays.equals(freq_p, freq_s)) {
            count++;
        }

        while (right < s.length()) {
            freq_s[s.charAt(right)]++;
            freq_s[s.charAt(left)]--;
            left++;
            right++;
            if (Arrays.equals(freq_p, freq_s)) {
                count++;
            }

        }

        System.out.println(count);
    }
}