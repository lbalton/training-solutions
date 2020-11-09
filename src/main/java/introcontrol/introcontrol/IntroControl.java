package introcontrol.introcontrol;

public class IntroControl {


    public int substractTenIfGreaterThanTen(int number){
          if (number <= 10){
             return number;
       }
          else {
             return  number-10;
       }
    }

    public String describeNumber(int number){
        if (number == 0){
            return "Zero";
        }
        else {
            return "Not Zero";
        }
    }

        public String greetingToJoe(String name){
            if (name.equals("Joe")){
                return "Hello Joe";
            }
            else {
                return "";
        }
    }
        public int calculateBonus(int sale){
        if (sale>= 1000_000){
            return (sale / 100) * 10 ;
        }
        else{
        return 0;
    }
}
        public int calculateConsumption(int prev, int next){
        if (prev <= next){
            return next - prev;
        }
        else{
            return (9999 - prev) + next;
        }
        }

        public void printNumbers(int max) {
            for (int x = 0; x <= max; x++) {
            System.out.println(x);
        }
    }
         public void printNumbersBetween(int min, int max){
        for ( int x = 0; x<=max; x++){
            System.out.println(x);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (b > a) {
            for (int x = a; x <= b; x++) {
                System.out.println(x);
            }
        } else {
            for (int x = a; x >= b; x--) {
                System.out.println(x);
            }
        }
    }




}