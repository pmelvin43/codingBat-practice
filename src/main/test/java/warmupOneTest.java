package main.test.java;

import main.java.sleepIn;
import org.junit.Test;

import static org.junit.Assert.*;

public class warmupOneTest {
    @Test
    public void notWeekdayNotVacationEqualsSleepIn() {
        var sleepTest = new sleepIn();
        assertTrue(sleepTest.sleepsIn(false, false));
    }

    @Test
    public void WeekdayNotVacationEqualsNoSleepIn() {
        var sleepTest = new sleepIn();
        assertFalse(sleepTest.sleepsIn(true, false));
    }

    @Test
    public void notWeekdayVacationEqualsSleepIn() {
        var sleepTest = new sleepIn();
        assertTrue(sleepTest.sleepsIn(false, true));
    }

    @Test
    public void WeekdayVacationEqualsSleepIn() {
        var sleepTest = new sleepIn();
        assertTrue(sleepTest.sleepsIn(true, true));
    }
}