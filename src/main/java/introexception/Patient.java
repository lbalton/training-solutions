package introexception;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;


    public Patient(String name, String ssn, int year){
        if (name.equals("") || name.isEmpty()){
            throw new IllegalArgumentException("Ne hagyd üresen a nevet");
        }
        if (yearOfBirth<= 1900){
            throw new IllegalArgumentException("Nem valós születési dátum: " + yearOfBirth);
        }
        if (!new SsnValidator().isValidSsn(ssn))
            throw new IllegalArgumentException("Invalid Social Security Number: " + ssn);
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.socialSecurityNumber = ssn;
    }

    public String getName() {
        return name;
    }
    public String getSocialSecurityNumber() {
        return  socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


}
