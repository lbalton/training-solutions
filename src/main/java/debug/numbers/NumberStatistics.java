package debug.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberStatistics {

    List<Integer> numbers = new ArrayList<>();

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n != 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for(int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1);
            if(actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

}