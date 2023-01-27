package org.codewars.kyu876;

import java.util.Arrays;

public class AddAll {

        public static int addAll(final int[] numbers) {
            Arrays.sort(numbers);
            int cost = 0;
            int partialSum = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                partialSum += numbers[i];
                cost += partialSum;
            }
            return cost;
        }
}
