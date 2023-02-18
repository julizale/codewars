package org.codewars.kyu876;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCharactersTest {

    @Test
    void testSolve() {
        StringCharacters characters = new StringCharacters();

        assertEquals(characters.solve(""), List.of(0,0,0,0));
        assertEquals(characters.solve("aAbBcC"), List.of(3,3,0,0));
        assertEquals(characters.solve("Codewars@codewars123.com"), List.of(1,18,3,2));
        assertEquals(characters.solve("bgA5<1d-tOwUZTS8yQ"), List.of(7,6,3,2));
        assertEquals(characters.solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"), List.of(9,9,6,9));
        assertEquals(characters.solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"), List.of(15,8,6,9));
        assertEquals(characters.solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"), List.of(10,7,3,6));
        assertEquals(characters.solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"), List.of(7,13,4,10));
    }
}