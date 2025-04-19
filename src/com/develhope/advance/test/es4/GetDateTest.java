package com.develhope.advance.test.es4;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class GetDateTest {

    @Test
    void testGetDate() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals(2023, date.getYear(), "Year should be 2023");
        assertEquals(3, date.getMonthValue(), "Month should be March (3)");
        assertEquals(1, date.getDayOfMonth(), "Day should be 1");
        assertEquals(DayOfWeek.WEDNESDAY, date.getDayOfWeek(), "Day should be Wednesday");
    }
}