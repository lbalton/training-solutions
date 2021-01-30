package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random rnd, List<Student> students) {
        this.className = className;
        this.rnd = rnd;
        this.students = students;
    }

    public boolean addStudent(Student student){
        return  false;
    }

    public double calculateClassAverage(){
        return 0.0;
    }

    public double calculateClassAverageBySubject(Subject subject){
        return 0.0;
    }

    public Student findStudentByName(String StudentName){

        return null;
    }

    public String getClassName(){

        return null;
    }

    public boolean isEmpty(String name){
        return  false;
    }

    public String listStudentNames(){
        return  null;
    }

    public List<StudyResultByName> listStudyResults(Student student){
        return  null;
    }

    public boolean removeStudent(Student student){
        return false;
    }

    public Student repetition(Student student){
        return null;
    }

}
