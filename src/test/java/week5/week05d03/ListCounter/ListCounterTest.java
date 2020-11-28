 package week5.week05d03.ListCounter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {


    @Test

     public void testCreated()  {

    ListCounter listCounter = new ListCounter();

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apricot");
        fruits.add("Kindertojás");
       assertEquals(2,new ListCounter().countLetter(fruits));

    }



}
