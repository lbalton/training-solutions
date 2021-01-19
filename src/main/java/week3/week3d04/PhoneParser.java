package week3.week3d04;

public class PhoneParser {

    public Phone parse(String text) {

        String prefix = text.substring(0, 2);
        String number = text.substring(3, 9);

        return new Phone(prefix, number);
    }

    public static void main(String[] args) {

        String num = "30-383232";

        PhoneParser phoneParser = new PhoneParser();
        Phone phone = phoneParser.parse(num);

        System.out.println(phone.getPrefix() + "-" + phone.getNumber());


    }

}
