package collectionslist;

import java.util.*;

public class Lotto {


    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {

        if (lotteryType < 0 || ballCount < 0) {
            throw new IllegalArgumentException("Nem lehet a szám negatív");
        }

        if (lotteryType == 0 || ballCount == 0) {
            throw new IllegalArgumentException("Nem lehet a megadott érték 0");
        }

        if (ballCount < lotteryType) {
            throw new IllegalArgumentException("Nem lehet kevesebb golyó, mint a kihúzandó számok." + ballCount);
        }


        List<Integer> balls = new ArrayList<>();
        HashSet<Integer> theNumbers = new HashSet<>(lotteryType + 1);


        for (int x = 1; x <= ballCount; x++) {
            balls.add(x);
        }

        Collections.shuffle(balls);

        for (int x = 1; x <= lotteryType; x++) {


            while (theNumbers.size() < lotteryType) {
                theNumbers.add(getRandom(balls));
            }

        }


        List<Integer> numbersInArray = new ArrayList<>(theNumbers);

        Collections.sort(numbersInArray);

        return numbersInArray;
    }

    public static int getRandom(List<Integer> array) {
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }


    public static void main(String[] args) {

        System.out.println(new Lotto().selectWinningNumbers(5, 20));

    }
}
