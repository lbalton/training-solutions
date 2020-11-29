package week5.week05d05.User;

import week5.week05d04Product.Store;

public class User {

    private String firstName;
    private String lastName;
    private String emailAddress;


    public User(String firstName, String lastName, String emailAdress) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.emailAddress = emailAdress;
        if (!(emailAdress.contains("@") && emailAdress.contains(".") )){
        throw new IllegalArgumentException("This is not valid email address!");
        }

    }
    public String fullNameWithEmail(){
    return firstName + " " + lastName + " " + emailAddress ;


    }


    public static void main(String[] args) {

        User user = new User("John", "Doe", "lbalton@hotmail.com");

        System.out.println(user.fullNameWithEmail());


    }
}
