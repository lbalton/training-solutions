package controlselection.week;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DaysOfWeekTest {


    @Test
    public void testWhichDay(){

        assertEquals("Még csak a hét legeleje van. :( ", new DayOfWeeks().dayOfTheWeek("Hétfő"));


    }
}
