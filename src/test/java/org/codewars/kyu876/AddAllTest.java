package org.codewars.kyu876;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddAllTest {

    @Test
    public void basicTests() {
        doTest(new int[]{1,2,3}, 9);
        doTest(new int[]{1,2,3,4}, 19);
        doTest(new int[]{1,2,3,4,5}, 34);
    }
    private void doTest(final int[] numbers, final int expected) {
        assertEquals(expected, AddAll.addAll(numbers));
    }

}