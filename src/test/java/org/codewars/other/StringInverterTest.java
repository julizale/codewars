package org.codewars.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInverterTest {

    @Test
    void testInvert() {
        //Given
        StringInverter stringInverter = new StringInverter();
        //When & Then
        assertEquals("madA", stringInverter.invert("Adam"));
        assertEquals("awE", stringInverter.invert("Ewa"));
        assertEquals("kajaK", stringInverter.invert("Kajak"));
    }
}