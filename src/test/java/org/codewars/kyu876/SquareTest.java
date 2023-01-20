package org.codewars.kyu876;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals(false, Square.isSquare(-1));
        assertEquals(true,   Square.isSquare(0));
        assertEquals(false,  Square.isSquare(3));
        assertEquals(true,   Square.isSquare(4));
        assertEquals(true,   Square.isSquare(25));
        assertEquals(false,  Square.isSquare(26));
        assertEquals(false,  Square.isSquare(91776648));
    }
}
