package org.codewars.kyu543;

public class SumStrings {

    public static String sumStrings(String a, String b) {
        int max = Math.max(a.length(), b.length());
        if (a.length() != b.length()) {
            StringBuilder shorter = new StringBuilder(a.length() > b.length()? b : a);
            while (shorter.length() < max) {
                shorter.insert(0, "0");
            }
            if (a.length() > b.length()) {
                b = shorter.toString();
            } else {
                a = shorter.toString();
            }
        }
        StringBuilder result = new StringBuilder();
        int rest = 0;
        for (int i = max - 1; i >= 0; i--) {
            int aDigit = i < a.length() ? Character.getNumericValue(a.charAt(i)) : 0;
            int bDigit = i < b.length() ? Character.getNumericValue(b.charAt(i)) : 0;
            int sum = aDigit + bDigit + rest;
            if (sum > 9) {
                result.insert(0, String.valueOf(sum - 10));
                rest = 1;
            } else {
                result.insert(0, String.valueOf(sum));
                rest = 0;
            }
        }
        if(rest > 0) {
            result.insert(0, String.valueOf(rest));
        }
        if (result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
