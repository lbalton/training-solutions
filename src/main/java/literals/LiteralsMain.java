package literals;


public class LiteralsMain {
    public static void main(String[] args) {

        System.out.println(1+ "" + 2);
        System.out.println();

        double quotient = 3/4;

        System.out.println(quotient);

        //mert 2 egész számot adtunk meg, és emiatt kaptunk ennyit.

        double quotient2 = 3.0 / 4;

        System.out.println(quotient2);

        //így már tört formátumben kaptuk vissza.

        long big = 3_244_444_444L;

        // A tanultak alapján ide kell a "l / L" karakter. De inkább a "L" hogy ne keverjük az "1" el.

        System.out.println(big);


    String text = "árvíztűrőtükörfúrógép";

    String word = "title".toUpperCase();

        System.out.println(word);




}
}
