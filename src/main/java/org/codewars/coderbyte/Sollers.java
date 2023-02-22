package org.codewars.coderbyte;

public class Sollers {


}
//import java.util.*;
//import java.io.*;
//
//class Main {
//
//  public static String StringChallenge(String str) {
//    if (str == null || str.length() == 0) {
//      return "";
//    }
//    if (str.length() == 1) {
//      return "1" + str;
//    }
//    StringBuilder stringBuilder = new StringBuilder();
//    char lastChar = str.charAt(0);
//    int count = 1;
//    for (int i = 1 ; i < str.length() ; i++) {
//      char c = str.charAt(i);
//      if (c == lastChar) {
//        count++;
//      } else {
//        stringBuilder.append(count);
//        stringBuilder.append(lastChar);
//        lastChar = c;
//        count = 1;
//      }
//    }
//    stringBuilder.append(count);
//    stringBuilder.append(lastChar);
//    return stringBuilder.toString();
//  }
//
//  public static void main (String[] args) {
//    // keep this function call here
//    Scanner s = new Scanner(System.in);
//    System.out.print(StringChallenge(s.nextLine()));
//  }
//
//}

//String Challenge
//Have the function StringChallenge(str) take the str parameter being passed and return a compressed version of the string using the Run-length encoding algorithm. This algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols.
//Examples
//Input: "aabbcde"
//Output: 2a2b1c1d1e
//Input: "wwwbbbw"
//Output: 3w3b1w
//Browse Resources
//Search for any help or documentation you might need for this problem. For example: array indexing, Ruby hash tables, etc.