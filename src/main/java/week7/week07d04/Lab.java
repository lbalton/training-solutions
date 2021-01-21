
package week7.week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;


    public Lab(String title) {
        this.title = title;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(LocalDate completedAt){
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(){
        completed = true;
        completedAt = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }

    public static void main(String[] args) {

        Lab lab = new Lab("BankProject");

        System.out.println(lab.completed);


    }
}
