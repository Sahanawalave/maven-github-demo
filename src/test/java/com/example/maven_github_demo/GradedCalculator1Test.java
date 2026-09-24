package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GradedCalculator1Test {

    @Test
    void testTotal() {
        assertEquals(225, Grade_Calculator.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0, Grade_Calculator.calculateAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(Grade_Calculator.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(Grade_Calculator.isPass(35.0));
    }
}
