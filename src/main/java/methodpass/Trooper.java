package methodpass;

public class Trooper {

    private Position position;
    private String name;

    public Trooper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition(){
        return position;
    }

    public void changePosition(Position target){
        this.position = position;
    }

    public double distanceFrom(Position target){
        return this.position.distanceFrom(position);
    }
}
