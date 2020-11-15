package introconstructors;

public class TaskMain {
    public static void main(String[] args) {

        Task task = new Task("Java Tanulás" , "Setter/Getter konstruktor");

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());

        task.setDuration(321);

        System.out.println(task.getDuration());

        task.Star();

        System.out.println(task.getStartDateTime());



    }
}
