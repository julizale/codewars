package org.codewars.kyu876;

import java.util.List;

public class StringCharacters {

    public List<Integer> solve(String s) {
        int upperCase = 0;
        int lowerCase = 0;
        int numbers = 0;
        int special = 0;
        for (Character c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                special++;
            }
        }
        return List.of(upperCase, lowerCase, numbers, special);
    }
}
