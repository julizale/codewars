package org.codewars.kyu876;
import java.util.*;

public class SentenceFromWords {

    public static String formatWords(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        words = removeEmptyStrings(words);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            sb.append(words[i]);
            if (i < words.length - 2){
                sb.append(", ");
            } else if (i == words.length - 2){
                sb.append(" and ");
            }
        }
        return sb.toString();
    }

    public static String[] removeEmptyStrings(String[] words){
        List<String> list = new LinkedList<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        for (String s: list) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}