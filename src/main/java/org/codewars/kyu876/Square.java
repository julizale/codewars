package org.codewars.kyu876;

public class Square {

    public static boolean isSquare(int n) {
        return Math.pow((int)Math.sqrt(n), 2) == n;
    }
}
