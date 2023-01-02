package org.codewars.kyu876;

public class NumberFun {

    public static long findNextSquare(long sq) {
        long x = (long)Math.sqrt(sq);
        return Math.pow(x, 2) == sq ? (long) Math.pow(x + 1, 2) : -1;
    }

}
