package org.codewars.kyu543;

public class RgbHex {

    public class RgbToHex {

        public static String rgb(int r, int g, int b) {
            return mapDecToHex(r) + mapDecToHex(g) + mapDecToHex(b);
        }

        public static String mapDecToHex(int dec) {
            if (dec <= 0) {
                return "00";
            }
            if (dec > 255) {
                return "FF";
            }
            String hexDigits = "0123456789ABCDEF";
            StringBuilder hex = new StringBuilder();
            while (dec > 0) {
                char digit = hexDigits.charAt(dec % 16);
                hex.insert(0, digit);
                dec /= 16;
            }
            if (hex.length() < 2) hex.insert(0, 0);
            return hex.toString();
        }
    }
}
