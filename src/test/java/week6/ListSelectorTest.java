package week6;

import org.junit.jupiter.api.Test;
import week6.week06d01.ListSelector.ListSelector;


import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ListSelectorTest {


    @Test

    public void createTest(){

        assertEquals("[ Alma Feri]" ,new ListSelector().getEverySecond(Arrays.asList("Alma","Kacsa","Feri")));

    }

    @Test

    public  void  createExeptionTest(){

        assertThrows(IllegalArgumentException.class,()-> new ListSelector().getEverySecond(null));
    }



}
