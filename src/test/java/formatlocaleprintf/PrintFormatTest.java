package formatlocaleprintf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrintFormatTest {

    @Test

    public void createTest(){

        assertEquals("Your fav. num. is. 32", new PrintFormat().printFormattedText(32));
        assertEquals("There is 5 piece of Apple", new PrintFormat().printFormattedText(5,"Apple"));
        assertEquals("The value is 3,2", new PrintFormat().printFormattedText(3.2));


    }
}
