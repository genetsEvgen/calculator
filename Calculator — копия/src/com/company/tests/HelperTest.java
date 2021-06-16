package com.company.tests;

import com.company.Helper;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void testConvertRomanToArab() {
        String romanNumber = "XIV";
        int expected = 14;

        int actual = Helper.convertRomanToArab(romanNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertArabToRoman(){
        int arab = 24;
        String expected = "XXIV";

        String actual = Helper.convertArabToRoman(arab);

        assertEquals(expected, actual);
    }
}