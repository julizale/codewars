package org.codewars.leet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void testFirstBadVersion() {
        //Given
        FirstBadVersion firstBadVersion = new FirstBadVersion(4);

        //When & Then
        assertEquals(4, firstBadVersion.firstBadVersion(5));
        assertEquals(4, firstBadVersion.firstBadVersion(12));
        assertEquals(4, firstBadVersion.firstBadVersion(1000));
    }
}