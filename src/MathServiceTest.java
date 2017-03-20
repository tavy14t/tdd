import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathServiceTest {
    @Test
    public void leap_year_should_be_divisible_by_four(){
        assertTrue(MathService.isLeapYear(2016));
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_four(){
        assertFalse(MathService.isLeapYear(3));
    }

    @Test
    public void leap_year_should_be_divisible_by_four_and_not_divisible_by_100(){
        assertTrue(MathService.isLeapYear(2004));
        assertFalse(MathService.isLeapYear(1800));
    }

    @Test
    public void leap_year_should_be_divisible_by_400(){
        assertTrue(MathService.isLeapYear(2000));
    }

    @Test
    public void leap_year_must_be_positive(){
        assertFalse(MathService.isLeapYear(-50));
    }

    @Test
    public void multiple_tests(){
        assertTrue(MathService.isLeapYear(2000));
        assertTrue(MathService.isLeapYear(1904));
        assertFalse(MathService.isLeapYear(1900));
        assertFalse(MathService.isLeapYear(1901));
    }
}

