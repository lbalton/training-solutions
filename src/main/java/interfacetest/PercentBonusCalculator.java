package interfacetest;

public class PercentBonusCalculator implements BonusCalculator {

    @Override
    public int calculateBonus(int salery) {
        return (int)(salery * 1.25);
    }
}
