package methodchain;

public class Robot {

    private int distance;
    private int azimut;


    public Robot(int distance, int azimut) {
        this.distance = distance;
        this.azimut = azimut;
    }


    public Robot go (int meter){
        this.distance += meter;
        return this;


    }
    public Robot rotate(int angle){
        this.azimut += angle;
        return this;

    }


}
