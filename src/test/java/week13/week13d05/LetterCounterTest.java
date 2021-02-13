package week13.week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LetterCounterTest {


    @Test

    public void CounterTest(){

        LetterCounter letterCounter = new LetterCounter();

        letterCounter.Counter("Fa");

        assertEquals(2 , letterCounter.Counter("Fa"));
        assertEquals(1 , letterCounter.Counter("FFfFFF"));
        assertEquals(0 , letterCounter.Counter("123123"));
        assertEquals(0 , letterCounter.Counter("úűüűüóöűö"));
        assertEquals(3 , letterCounter.Counter("AAALLLLMMMAAa"));

        assertThrows(IllegalArgumentException.class, () -> letterCounter.Counter(" "));


    }



}
