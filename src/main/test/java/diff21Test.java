package main.test.java;

import main.java.diff21;
import org.junit.Test;

import static org.junit.Assert.*;

public class diff21Test {

    @Test
    public void testDiff21(){
        diff21 calc = new diff21();

        // Test cases where n is less than 21
        assertEquals(1, calc.difference21(20));  // One less than 21
        assertEquals(20, calc.difference21(1));  // Significantly less than 21
        assertEquals(21, calc.difference21(0));  // Exactly 21 less
        assertEquals(26, calc.difference21(-5)); // Handling negative values

        // Test case where n is equal to 21
        assertEquals(0, calc.difference21(21));  // Exact value, difference should be zero

        // Test cases where n is greater than 21
        assertEquals(2, calc.difference21(22));  // One more than 21, testing doubled small difference
        assertEquals(10, calc.difference21(26)); // Slightly larger value, testing doubled difference
        assertEquals(60, calc.difference21(51)); // Significantly larger value, testing doubled larger difference

        // Additional test cases for edge values
        assertEquals(40, calc.difference21(41)); // Much greater than 21, testing doubled larger difference
    }
}