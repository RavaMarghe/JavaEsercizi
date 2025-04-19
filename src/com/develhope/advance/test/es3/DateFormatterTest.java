package com.develhope.advance.test.es3;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    public void testDateFormatter() {
        String input = "2023-03-01T13:00:00Z";
        String expected = "01 marzo 2023";
        String actual = DateFormatter.dateFormatter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testChristmasDate() {
        String input = "2025-12-25T13:00:00Z";
        String expected = "25 dicembre 2025";
        String actual = DateFormatter.dateFormatter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotValidInput() {
        String input = "Jonny";
        assertThrows(DateTimeParseException.class, () -> {
            DateFormatter.dateFormatter(input);
        });
    }

    @Test
    public void testNullDate() {
        assertThrows(NullPointerException.class, () -> {
            DateFormatter.dateFormatter(null);
        });
    }
}