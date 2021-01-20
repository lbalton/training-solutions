package week4.week4d01;

public class NameChanger {


    private String fullName;

    public NameChanger(String fullName) {

        if (fullName.isBlank() || fullName.equals(null)) {
            throw new IllegalStateException("Invalid Name!" + fullName);
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String firsName) {
    String s = firsName.trim();
    fullName = fullName.replace(fullName.substring(fullName.indexOf(" ")+1),s);

    }

    public static void main(String[] args) {
        NameChanger nameChanger = new NameChanger("Lengyel Bálint");
        System.out.println(nameChanger.fullName);

        nameChanger.changeFirstName("Karcsi");

        System.out.println(nameChanger.fullName);

    }
}
