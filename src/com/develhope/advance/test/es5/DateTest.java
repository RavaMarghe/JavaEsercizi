package com.develhope.advance.test.es5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {
    OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

    @Test
    void testFirstBeforeSecond() {
        assertTrue(date1.isBefore(date2), "date1 dovrebbe essere precedente a date2");
    }

    @Test
    void testSecondAfterFirst() {
        assertTrue(date2.isAfter(date1), "date2 dovrebbe essere precedente a date1");
    }

    @Test
    void testDateEqualNow() {
        assertNotEquals(date1, OffsetDateTime.now(), "date1 dovrebbe essere diversa dalla data attuale");
        assertNotEquals(date2, OffsetDateTime.now(), "date2 dovrebbe essere diversa dalla data attuale");

    }

    @Test
    void testAreEquals() {
        assertNotEquals(date1, date2, "Le due date dovrebbero essere differenti");
    }

}
