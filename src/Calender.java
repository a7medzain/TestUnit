import static org.junit.Assert.*;
import java.util.Scanner;


public  class Calender {
    private int year;
    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
            } else
                isLeap = true;
        }

        return isLeap;
    }
    @org.junit.jupiter.api.Test

    public void testCal()
{
    year = 2020;
    this.setYear(year);
   assertEquals(true, isLeapYear());
}
}