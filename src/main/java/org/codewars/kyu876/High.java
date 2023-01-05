package org.codewars.kyu876;

public class High {

    public static String high(String s) {
        String[] words = s.split(" ");
        String winningWord = "";
        int highScore = 0;
        for (String word: words) {
            int score = 0;
            char[] chars = word.toCharArray();
            for (char c: chars) {
                score += (int)c - 96;
            }
            if (score > highScore) {
                highScore = score;
                winningWord = word;
            }
        }
        return winningWord;
    }
}
