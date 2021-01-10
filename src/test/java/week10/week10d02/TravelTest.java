package week10.week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void getMaxIndex() {
        int max = new Travel().getMaxIndex(List.of(1,1,2,3,10,7,7,7,7));
        assertEquals(7, max);
    }
}