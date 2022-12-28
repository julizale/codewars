package org.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        List<Character> list = new ArrayList<>();
        for (char c: walk) {
            list.add(c);
        }
        int ns = Collections.frequency(list, 'n');
        int ws = Collections.frequency(list, 'w');
        int ss = Collections.frequency(list, 's');
        int es = Collections.frequency(list, 'e');
        return walk.length == 10 && ns == ss && es == ws;
    }
}
