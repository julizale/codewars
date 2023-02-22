package org.codewars.kyu876;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Gloves {

    public static int numberOfPairs(String[] gloves) {
        List<String> list = new LinkedList<>(Arrays.asList(gloves));
        int count = 0;
        while(list.size() > 0) {
            for (int i = 1; i < list.size(); i++){
                if (list.get(0).equals(list.get(i))){
                    list.remove(i);
                    count++;
                    break;
                }
            }
            list.remove(0);
        }
        return count;
    }
}
