package com.develhope.advance.test.es1;

import com.develhope.basics.funzioni.SommaInteri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SommaInteriTest {

    @Test
    void somma() {
        assertEquals(7, SommaInteri.somma(3, 4));
    }
}