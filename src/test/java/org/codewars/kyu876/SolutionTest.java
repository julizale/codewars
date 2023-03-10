package org.codewars.kyu876;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, Solution.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, Solution.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, Solution.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, Solution.longestRepetition(""));
    }

    @Test
    public void testDecrypt() {
        Solution enc = new Solution();
        assertEquals("", enc.encrypt("", 1));
        assertEquals( "b", enc.encrypt("a", 1));
        assertEquals("rngcug\"gpet{rv\"og", enc.encrypt("please encrypt me", 2));
    }
}