package org.codewars.kyu876;

import java.util.ArrayList;
import java.util.List;

public class SpinWords {

    public String spinWords(String sentence) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                words.add(word.toString());
                word = new StringBuilder();
            } else {
                word.append(sentence.charAt(i));
                if (i == sentence.length() - 1) {
                    words.add(word.toString());
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            result.append(w.length() > 4 ? invertWord(w) : w);
            if (i < words.size() - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }

    private String invertWord(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.insert(0, str.charAt(i));
        }
        return result.toString();
    }
}

//boolean inverting = true;
//        StringBuilder result = new StringBuilder();
//        StringBuilder inverted = new StringBuilder();
//        for (int i = 0; i < sentence.length(); i++) {
//            if (inverting) {
//                result.insert(0, sentence.charAt(i));
//            } else {
//                result.append(sentence.charAt(i));
//            }
//            if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
//                if (inverting) {
//                    inverting = false;
//                    result.append(inverted);
//                    inverted = new StringBuilder();
//                } else {
//                    inverting = true;
//                }
//            }
//            System.out.println("inverted:  " + inverted);
//            System.out.println("result:  " + result);
//        }
//        return result.toString();