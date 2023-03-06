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
}

