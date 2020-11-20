package controlselection.week;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DaysOfWeekTest {


    @Test
    public void testWhichDay(){

        assertEquals("Még csak a hét legeleje van. :( ", new DayOfWeeks().dayOfTheWeek("Hétfő"));
        assertEquals("Már a hét közepe van! :| ", new DayOfWeeks().dayOfTheWeek("szerda"));
        assertEquals("Már mindjárt hétvége! :)", new DayOfWeeks().dayOfTheWeek("PéNtEk"));
        assertEquals(" Juhhu hétvége! :D", new DayOfWeeks().dayOfTheWeek("szomBat"));

        //assertEquals("Ismeretlen nap!", new DayOfWeeks().dayOfTheWeek("perec"));


    }
}
