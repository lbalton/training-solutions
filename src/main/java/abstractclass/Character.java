package abstractclass;

import java.util.Random;

public abstract class Character {

    private boolean isAlive = true;
    private Point position;
    private int hitPoint = 100;
    Random random;


    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive(){

        if (hitPoint <= 0){
            this.isAlive = false;
        }
        return isAlive;
    }

    protected int getActualPrimaryDamage(){
        return random.nextInt(10) + 1;
    }

    private int getActualDefence(){
        return random.nextInt(5) + 1;
    }

    protected void hit(Character enemy, int damage) {
        int actualDefence = enemy.getActualDefence();
        if(actualDefence < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        this.hitPoint -= diff;
    }

    public abstract void secondaryAttack(Character enemy);

    public int getHitPoint() {
        return hitPoint;
    }

    public Point getPosition() {
        return position;
    }


    public Random getRandom() {
        return random;
    }

}
