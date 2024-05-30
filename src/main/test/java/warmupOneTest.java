package main.test.java;

import main.java.warmupOne;
import org.junit.Test;

import static org.junit.Assert.*;

public class warmupOneTest {
    @Test
    public void notWeekdayNotVacationEqualsSleepIn() {
        var sleepTest = new warmupOne();
        assertTrue(sleepTest.sleepIn(false, false));
    }

    @Test
    public void WeekdayNotVacationEqualsNoSleepIn() {
        var sleepTest = new warmupOne();
        assertFalse(sleepTest.sleepIn(true, false));
    }

    @Test
    public void notWeekdayVacationEqualsSleepIn() {
        var sleepTest = new warmupOne();
        assertTrue(sleepTest.sleepIn(false, true));
    }

    @Test
    public void WeekdayVacationEqualsSleepIn() {
        var sleepTest = new warmupOne();
        assertTrue(sleepTest.sleepIn(true, true));
    }
}