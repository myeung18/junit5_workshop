package com.oreilly;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1, "2 should be the sum of 1 and 1");
    }

    @Test
    void testP() {
        Predicate<String> p = String::isBlank;
    }
}
