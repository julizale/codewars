package org.codewars;

import org.codewars.kyu543.PiggyWiggy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PiggyWiggy.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PiggyWiggy.pigIt("This is my string"));
        assertEquals("...poratay oay oresmay [!]", PiggyWiggy.pigIt("...tpora o mores [!]"));
   //     expected:<...poratay oay oresmay [!]> but was:<...poratay oay oresmay [may!may]>
    }
}
