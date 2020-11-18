package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test

    public void testCreate() {

    Gentleman gentleman = new Gentleman();

         String name = gentleman.sayHello("Don Joe");
       assertThat(name, equalTo("Hello Don Joe"));


        String AnotherName = gentleman.sayHello("Balint");
        assertThat(AnotherName, equalTo("Hello Anunimus"));








    }
}
