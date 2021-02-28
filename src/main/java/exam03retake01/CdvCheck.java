package exam03retake01;

public class CdvCheck {



    public boolean check(String cdvNum){


        if (cdvNum.length() != 10){
            throw new IllegalArgumentException("This is not a CDV code!");
        }

        int sum = 0;
        int multiplier = 1;
        boolean isItCorrect;


        for (int x = 0;x< (cdvNum.length()-1);x++){
           int num = Integer.parseInt(Character.toString(cdvNum.charAt(x)));
           sum += num * multiplier;
           multiplier++;
            System.out.println(num);

        }
        isItCorrect = sum % 11 == Integer.parseInt(Character.toString(cdvNum.charAt(9)));

        return isItCorrect;
    }

    public static void main(String[] args) {

        System.out.println(new CdvCheck().check("8365670003"));




    }




}


   // int inNum = cdvNum.charAt(x);