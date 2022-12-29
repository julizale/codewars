package org.codewars.kyu876;

public class DigPow {

    public static long digPow(int n, int p) {
        String str = Integer.toString(n);
        long powered = 0;
        for (int i = 0; i < str.length(); i++) {
            powered += Math.pow(str.charAt(i) -'0', p + i);
        }
        return powered % n == 0 ? powered / n : -1;
    }
}
