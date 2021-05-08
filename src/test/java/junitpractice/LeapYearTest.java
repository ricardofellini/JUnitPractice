package junitpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void leapYearsThatAreNonCenturialYears(){
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYes(2016);
        Assertions.assertTrue(result);
    }
}
