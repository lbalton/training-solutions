package week3;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;

    private int bonus;

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("Ceo", 300000));
        positions.add(new Position("HR Manager", 190000));
        positions.add(new Position("HR Manager", 54000));
        positions.add(new Position("Costumer Service", 20000));
        positions.add(new Position("House Keeper", 10000));

        for (Position position : positions) {
            if (position.getBonus() > 150000  ){
            System.out.println(position);

        }

        }

    }


}