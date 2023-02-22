package org.codewars.coderbyte;

public class Sollers2 {


}

//import java.util.*;
//import java.io.*;
//
//class Main {
//
//  public static String StringChallenge(String str) {
//    int positionOfHyphen = -1;
//    for (int i = 0 ; i < str.length() ; i++) {
//      if (str.charAt(i) == '-') {
//        positionOfHyphen = i;
//        break;
//      }
//    }
//
//    String start = str.substring(0, positionOfHyphen);
//    String end = str.substring(positionOfHyphen + 1);
//
//    int result = Main.getHour(start);
//    int endHour = Main.getHour(end);
//
//    int l = start.length();
//    int startMinutes = Integer.parseInt(start.substring(l-4, l-2));
//    l = end.length();
//    int endMinutes = Integer.parseInt(end.substring(l-4, l-2));
//    System.out.println("Start minutes" + startMinutes);
//    System.out.println("Endminutes " + endMinutes);
//
//
//    int hours = endHour - result;
//    if (hours < 0) {
//      hours += 12;
//    }
//    System.out.println("hours = " + hours);
//
//    int minutes = endMinutes - startMinutes;
//    if (minutes < 0) {
//      minutes += 60;
//    }
//    System.out.println("minutes = " + minutes);
//    return String.valueOf(minutes + 60 * hours);
//  }
//
//  public static int getHour(String hour) {
//    int result = 0;
//    if (hour.length() == 6) {
//      result = hour.charAt(0) - '0';
//      if (hour.charAt(4) == 'p') {
//        result += 12;
//      }
//      System.out.println("Result " + result)
//    } else {
//        String hourString = hour.substring(0, 2);
//        result = Integer.parseInt(hourString);
//        System.out.println(result);
//        if (hour.charAt(5) == 'p') {
//        result += 12;
//      }
//    }
//    return result;
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
//Have the function StringChallenge(str) take the str parameter being passed which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes between the two times. The time will be in a 12 hour clock format. For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
//Examples
//Input: "12:30pm-12:00am"
//Output: 690
//Input: "1:23am-1:08am"
//Output: 1425
//Browse Resources
//Search for any help or documentation you might need for this problem. For example: array indexing, Ruby hash tables, etc.


//import java.util.*;
//import java.io.*;
//
//class Main {
//
//  public static String StringChallenge(String str) {
//    int positionOfHyphen = -1;
//    for (int i = 0 ; i < str.length() ; i++) {
//      if (str.charAt(i) == '-') {
//        positionOfHyphen = i;
//        break;
//      }
//    }
//
//    String start = str.substring(0, positionOfHyphen);
//    String end = str.substring(positionOfHyphen + 1);
//
//    int startHour = Main.getHour(start);
//    int endHour = Main.getHour(end);
//
//    int l = start.length();
//    int startMinutes = Integer.parseInt(start.substring(l-4, l-2));
//    l = end.length();
//    int endMinutes = Integer.parseInt(end.substring(l-4, l-2));
//    System.out.println("Start minutes" + startMinutes);
//    System.out.println("Endminutes " + endMinutes);
//
//    int hours = endHour - startHour;
//    if (hours < 0) {
//      hours += 24;
//    }
//    System.out.println("hours = " + hours);
//
//    int minutes = endMinutes - startMinutes;
//    if (minutes < 0) {
//      minutes += 60;
//    }
//    System.out.println("minutes = " + minutes);
//    return String.valueOf(minutes + 60 * hours);
//  }
//
//  public static int getHour(String hour) {
//    int result = 0;
//    if (hour.length() == 6) {
//      result = hour.charAt(0) - '0';
//      if (hour.charAt(4) == 'p') {
//        result += 12;
//      }
//    } else {
//        String hourString = hour.substring(0, 2);
//        result = Integer.parseInt(hourString);
//        System.out.println("parsed hour in method: " + result);
//        if (hour.charAt(5) == 'a' && result == 12) {
//        result = 0;
//      }
//    }
//    System.out.println("method result: " + result);
//    return result;
//  }
//
//  public static void main (String[] args) {
//    // keep this function call here
//    Scanner s = new Scanner(System.in);
//    System.out.print(StringChallenge(s.nextLine()));
//  }
//
//} to było na koniec

//parsed hour in method: 12
//Start minutes30
//Endminutes 0
//hours = 0
//minutes = 30
//30
//parsed hour in method: 12
//method result: 12
//parsed hour in method: 12
//method result: 0
//Start minutes30
//Endminutes 0
//hours = 0
//minutes = 30
//30
//parsed hour in method: 12
//method result: 12
//parsed hour in method: 12
//method result: 0
//Start minutes30
//Endminutes 0
//hours = 12
//minutes = 30
//750
//== RUNNING SAMPLE TEST CASES ==
//
//== INPUT ==
//"12:30pm-12:00am"
//
//== OUTPUT ==
//parsed hour in method: 12
//method result: 12
//parsed hour in method: 12
//method result: 0
//Start minutes30
//Endminutes 0
//hours = 12
//minutes = 30
//750
//<< WRONG >>
//<< EXPECTED OUTPUT: 690 >>
//
//== INPUT ==
//"1:23am-1:08am"
//
//== OUTPUT ==
//method result: 1
//method result: 1
//Start minutes23
//Endminutes 8
//hours = 0
//minutes = 45
//45
//<< WRONG >>
//<< EXPECTED OUTPUT: 1425 >>
//
//== 8 TEST CASES HIDDEN ==
//
//parsed hour in method: 12
//method result: 12
//parsed hour in method: 12
//method result: 0
//Start minutes30
//Endminutes 0
//hours = 12
//minutes = 30
//750