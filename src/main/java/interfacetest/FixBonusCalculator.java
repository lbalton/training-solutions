package interfacetest;


public class FixBonusCalculator implements BonusCalculator{

    @Override
    public int calculateBonus(int salery) {
        return salery + 12_000;
    }
}
