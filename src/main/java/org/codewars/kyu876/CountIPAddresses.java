package org.codewars.kyu876;

import java.util.ArrayList;
import java.util.List;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        String[] startWords = start.split("\\.");
        String[] endWords = end.split("\\.");
        List<Integer> startNumbers = new ArrayList<>();
        for (String s : startWords) {
            startNumbers.add(Integer.valueOf(s));
        }
        List<Integer> endNumbers = new ArrayList<>();
        for (String s : endWords) {
            endNumbers.add(Integer.valueOf(s));
        }
        long result = 0;
        for (int i = 0; i < 4 ; i++) {
            result += (endNumbers.get(i) - startNumbers.get(i)) * Math.pow(256, 3 - i);
        }
        return result;
    }
}
