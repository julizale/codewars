package org.codewars;

import java.util.*;

public class Isogram {

    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        List<Character> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        for (char c: str.toCharArray()) {
            list.add(c);
            set.add(c);
        }
        return list.size() == set.size();
    }
}
