package org.codewars.other;

public class StringInverter {

    public String invert (String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            stringBuilder.insert(0, input.charAt(i));
        }
        return stringBuilder.toString();
    }
}
