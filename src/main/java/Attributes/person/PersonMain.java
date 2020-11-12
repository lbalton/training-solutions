package Attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        Address address = new Address("Hungary ", "Szeged ", "Anna 10. ", "6726 ");


        System.out.println(address.getCountry());

        System.out.println(address.getZipCode());

        System.out.println(address.getCity());

        System.out.println(address.addressToString());

        person.correctData("Lengyel Bálint", "0000001");


        System.out.println(person.personToString());



    }
}
