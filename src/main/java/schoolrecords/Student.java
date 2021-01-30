package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public double calculateAverage(){
        return 0.0;
    }
    public double calculateSubjectAverage(Subject subject){
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){

    }

    public boolean isEmpty(String name){
        return false;
    }

    public String Student (String name){
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
