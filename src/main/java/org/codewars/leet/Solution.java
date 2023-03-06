package org.codewars.leet;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        StringBuilder sub = new StringBuilder();
        String longestSub = "";
        for (int i = 0; i < s.length(); i++) {
            if (sub.toString().indexOf(s.charAt(i)) == -1) {
                sub.append(s.charAt(i));
            } else {
                if (sub.length() > longestSub.length()) {
                    longestSub = sub.toString();
                }
                i -= sub.length() - sub.toString().indexOf(s.charAt(i));
                sub = new StringBuilder();
            }
        }
        if (sub.length() > longestSub.length()) {
            longestSub = sub.toString();
        }
        return longestSub.length();
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                    result -= 1;
                } else {
                    result += 1;
                }
            }
            if (s.charAt(i) == 'V') {
                result += 5;
            }
            if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                    result -= 10;
                } else {
                    result += 10;
                }
            }
            if (s.charAt(i) == 'L') {
                result += 50;
            }
            if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                    result -= 100;
                } else {
                    result += 100;
                }
            }
            if (s.charAt(i) == 'D') {
                result += 500;
            }
            if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}

