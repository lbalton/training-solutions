package week6.week06d05.Biscuit;

import java.lang.reflect.Type;

public class Biscuit {

    BiscuitType type;
    int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount){
        return new Biscuit(type,gramAmount);
    }


}
