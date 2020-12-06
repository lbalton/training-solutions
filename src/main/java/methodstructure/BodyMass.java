package methodstructure;

public class BodyMass {
    private int weight;
    private double height;


    public BodyMass(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex(){
        return   weight / (height*height);
    }

    public BmiCategory body(){
        if (bodyMassIndex() < 18.5){
            return BmiCategory.UNDERWEIGHT;
        }
        if (bodyMassIndex() > 25){
            return BmiCategory.OVERWEIGHT;
        }
        else return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass another){
        return bodyMassIndex() < another.bodyMassIndex();

        }

    public static void main(String[] args) {

        BodyMass person1 = new BodyMass(73, 1.83);
        BodyMass person2 = new BodyMass(45, 1.59);

        System.out.println(person1.body());
        System.out.println(person2.body());




    }

    }
