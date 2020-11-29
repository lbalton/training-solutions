package week5.week05d05.UserTest;

import org.junit.jupiter.api.Test;
import week5.week05d05.User.User;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test

        public void createTest(){

        assertThrows(IllegalArgumentException.class,() -> new User("John", "Doe","dasda"));
        assertThrows(IllegalArgumentException.class,() -> new User("John", "Doe","da@asdas"));
        assertThrows(IllegalArgumentException.class,() -> new User("John", "Doe","da.asdas"));

        assertEquals("John Doe lbalton@hotmail.com", new User("John", "Doe", "lbalton@hotmail.com").fullNameWithEmail());

    }
}
