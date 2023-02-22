package org.codewars.kyu876;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlovesTest {

    @Test
    void tests() {

        assertEquals(0, Gloves.numberOfPairs(new String[] {}));
        assertEquals(1, Gloves.numberOfPairs(new String[] {"red", "red"}));
        assertEquals(0, Gloves.numberOfPairs(new String[] {"red", "green", "blue"}));
        assertEquals(3, Gloves.numberOfPairs(new String[] {"gray", "black", "purple", "purple", "gray", "black"}));
        assertEquals(4, Gloves.numberOfPairs(new String[] {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }
}