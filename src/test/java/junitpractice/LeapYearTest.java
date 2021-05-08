package junitpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void leapYearsThatAreNonCenturialYears(){
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertFalse(leapYear.isLeapYear(1500));
    }

    @Test
    public void nonLeapYear(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertFalse(leapYear.isLeapYear(2017));
    }
}
