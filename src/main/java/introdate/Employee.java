package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;


    public Employee(int year,int month,int day,String name){
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public String getName(){
        return name;
    }

    public LocalDateTime getBeginEmployment(){
    return beginEmployment;
    }

    public String setName(String name){
        return this.name = name;
    }

}
