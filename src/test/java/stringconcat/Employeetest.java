package stringconcat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Employeetest {

    @Test
    public void  testCreated(){
        Employee employee = new Employee("Lengyel Bálint","Junior dev",123123);

        assertEquals("Lengyel Bálint", employee.getName());
        assertEquals("Junior dev", employee.getJob());
        assertEquals(123123, employee.getSalary());
    }

    @Test
    public  void  testCreateWithNullName(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("", "java developer", 1321221));
        assertEquals("Név kötelező!", ex.getMessage());
    }
    @Test

    public  void  testCreateWithNullJob(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("John Doe", "", 1321221));
        assertEquals("Munka kötelező!", ex.getMessage());

}
}
