package references.parameters;

public class ReferencesMain {
    public static void  main(String[] args) {


    Person person1 = new Person("Nagy Zoltán", 43);
    Person person2 = person1;

    person2.setName("Para Zita");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        //Azt tapasztalom, hogy egyforma a szöveget ad vissza.
        //Mivel person2 értéke person1, így ha a person1 változik, akkor a person2 is.

        int number1 = 24;

        int number2 = number1;

        System.out.println(number1);
        System.out.println(number2);

        //ugyan az a 2 változó értéke, hiszen, n1 =24, n2 = n1 és n1 = 24


        Person person3 = person2;

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        //ugyan az ismét.

    }
}
