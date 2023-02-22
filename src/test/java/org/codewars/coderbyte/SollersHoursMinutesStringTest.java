package org.codewars.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SollersHoursMinutesStringTest {

    @Test
    void testStringChallenge() {
        //Given
        SollersHoursMinutesString hoursMinutesString = new SollersHoursMinutesString();

        //When  &  Then
        assertEquals(1, hoursMinutesString.stringChallenge("12:30am-12:31am"));
        assertEquals(1321, hoursMinutesString.stringChallenge("12:30am-10:31pm"));
        assertEquals(0, hoursMinutesString.stringChallenge("9:00am-9:00am"));
        assertEquals(1439, hoursMinutesString.stringChallenge("12:00am-11:59pm"));
        assertEquals(1199, hoursMinutesString.stringChallenge("2:00am-9:59pm"));
        assertEquals(1081, hoursMinutesString.stringChallenge("2:59pm-9:00am"));
    }
}