/*
        package week7d04;



import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;


    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }




    public void complete(int year,int month,int day){
        this.completedAt = LocalDate.of(year, month, day);
        this.completed = true;
    }

    public void complete(){
        this.completedAt = LocalDate.now();
    }




    public static void main(String[] args) {

        Lab lab = new Lab("BankProject");

        System.out.println(lab.complete(1992, 03, 01));




    }
}
*/