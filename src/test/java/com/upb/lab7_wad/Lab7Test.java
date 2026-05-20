package com.upb.lab7_wad;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lab7Test {
    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
    
    @Test
    void environment() {
        assertEquals("ABC", System.getenv("MY_SECRET_KEY"));
    }
}
