package org.codewars.kyu876;

public class Solution {

    public static Object[] longestRepetition(String s) {
        if (s.length() == 0) {
            return new Object[]{"", 0};
        }
        char winner = s.charAt(0);
        int longestCount = 1;
        int count = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                if (count > longestCount) {
                    longestCount = count;
                    winner = c;
                }
                c = s.charAt(i);
                count = 1;
            }
        }
        if (count > longestCount) {
            longestCount = count;
            winner = c;
        }
        return new Object[]{String.valueOf(winner), longestCount};
    }
}
