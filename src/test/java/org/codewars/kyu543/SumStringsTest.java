package org.codewars.kyu543;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumStringsTest {

    @Test
    void test() {
        assertEquals("579", SumStrings.sumStrings("123", "456"));
        assertEquals("212549588", SumStrings.sumStrings("6088", "212543500"));
        assertEquals("8842", SumStrings.sumStrings("45", "8797"));
    }
}