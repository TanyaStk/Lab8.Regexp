package com.project;

import static com.project.Main.isRegularNumber;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @org.junit.jupiter.api.Test
    void testIsRegularNumberWithPlus() {
        String number = "+375179832245";
        assertTrue(isRegularNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsRegularNumberWithDash() {
        String number = "+375-25-123-45-45";
        assertTrue(isRegularNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsRegularNumberWithBrackets() {
        String number = "+375(33)097-24-19";
        assertTrue(isRegularNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsRegularNumberWithoutSigns() {
        String number = "80298773216";
        assertTrue(isRegularNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsRegularWrongNumberWithPlus() {
        String number = "+80299832245";
        assertFalse(isRegularNumber(number));
    }
}