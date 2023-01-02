package org.codewars.kyu543;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class PiggyWiggy {

    public static String pigIt(String str) {
        CharacterIterator iterator = new StringCharacterIterator(str);
        StringBuilder result = new StringBuilder();
        boolean isFirstLetter = true;
        StringBuilder word = new StringBuilder();
        char firstLetter = 0;
        while (iterator.current() != CharacterIterator.DONE) {
            char ch = iterator.current();
            if (Character.isLetter(ch)) {
                if (isFirstLetter) {
                    firstLetter = ch;
                    isFirstLetter = false;
                } else {
                    word.append(ch);
                }
            } else if (Character.isWhitespace(ch)){
                result.append(word).append(firstLetter).append("ay").append(ch);
                isFirstLetter = true;
                word = new StringBuilder();
            } else {
                if (!word.isEmpty()) {
                    result.append(word).append(firstLetter).append("ay");
                    isFirstLetter = true;
                    word = new StringBuilder();
                }
                result.append(ch);
            }
            iterator.next();
            System.out.println(result);
        }
        if (!word.isEmpty()) {
            result.append(word).append(firstLetter).append("ay");
        }
        return result.toString();
    }
}
