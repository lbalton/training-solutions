package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test

    public void createTest(){

        Gentleman gentleman = new Gentleman();

        assertEquals("Hello Don Joe",new Gentleman().sayHello("Don Joe"));
        assertEquals("Hello Anunimus", new Gentleman().sayHello("Kossuth"));



    }


}
