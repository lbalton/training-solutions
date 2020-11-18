package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test

    public void testCreate() {

    Gentleman gentleman = new Gentleman();

    String name = gentleman.sayHello("Don");

    assertThat(name, equalTo("Hello Don"));



    




}
}
