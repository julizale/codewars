package org.codewars.kyu876;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceFromWordsTest {

    @Test
    public void sampleTests() {
        assertEquals("one, two, three and four", SentenceFromWords.formatWords(new String[] {"one", "two", "three", "four"}));
        assertEquals("one", SentenceFromWords.formatWords(new String[] {"one"}));
        assertEquals("one and three", SentenceFromWords.formatWords(new String[] {"one", "", "three"}));
        assertEquals("three", SentenceFromWords.formatWords(new String[] {"", "", "three"}));
        assertEquals("one and two", SentenceFromWords.formatWords(new String[] {"one", "two", ""}));
        assertEquals("", SentenceFromWords.formatWords(new String[] {}));
        assertEquals("", SentenceFromWords.formatWords(null));
        assertEquals("", SentenceFromWords.formatWords(new String[] {""}));
    }

}