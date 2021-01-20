package week5.week5d02;

public class ChangeLetter {


    public String changeVowels(String text) {

        String textWithOutVowel = text.replaceAll("[a,A,e,E,i,I,o,O,u,U,y,Y]", "*");

        return textWithOutVowel;

    }

    public static void main(String[] args) {

        ChangeLetter changeLetter = new ChangeLetter();

        System.out.println(changeLetter.changeVowels("AUEOUYyaeioufvonysdovyyndsonyyfdsfdsofndsfn fohnsdfoyyysdn fosdfn sdfo n"));
        System.out.println(changeLetter.changeVowels("YYYYYYAEAEAEyyyyyYYYYH1B4TL4NYYYYYYYyyyYYYAEAEAYyyYyYyy"));


    }
}

