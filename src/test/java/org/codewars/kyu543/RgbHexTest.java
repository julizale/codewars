package org.codewars.kyu543;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbHexTest {

    @Test
    public void basicTests() {
        assertEquals( "000000", RgbHex.RgbToHex.rgb(0, 0, 0));
        assertEquals( "010203", RgbHex.RgbToHex.rgb(1, 2, 3));
        assertEquals( "FFFFFF", RgbHex.RgbToHex.rgb(255, 255, 255));
        assertEquals( "FEFDFC", RgbHex.RgbToHex.rgb(254, 253, 252));
        assertEquals( "00FF7D", RgbHex.RgbToHex.rgb(-20, 275, 125));
    }

}