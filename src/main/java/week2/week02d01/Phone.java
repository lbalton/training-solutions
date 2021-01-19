package week2.week02d01;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;


    public Phone (String type, int mem){
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
        }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Phone phoneOne = new Phone("Samsung", 124);
        Phone phoneTwo = new Phone("Apple", 64);

        String phoneOneInString = phoneOne.type + "  " + phoneOne.mem + "Gb";
        String phoneTwoInString = phoneTwo.type + "  " + phoneTwo.mem + "Gb";

        System.out.println(phoneOneInString);
        System.out.println(phoneTwoInString);

        System.out.println("Milyen típusú telefonod van?");
        String phoneThreeType = scanner.nextLine();
        System.out.println("Hány GB memóriával rendelkezik?");
        int phoneThreeMem = scanner.nextInt();

        System.out.println("Telefonod: " + phoneThreeType + " " + phoneThreeMem + " Gb" );


        if(phoneTwo.mem > phoneThreeMem ) {
            System.out.println("Appleben és a Samsungban is több a memória mint a tiedben. Cseréld le.");
        }
            else if (phoneOne.mem > phoneThreeMem){
            System.out.println("Samsungban több a memória mint a tiedben. Cseréld le.");
        }
                else{
                System.out.println("A te telefonod rendelkezik a legtöbb memóriával.Tarts meg!");

            }

    }
}

