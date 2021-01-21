package week8.week08d01;

public class Point {

    private int y;
    private int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public int getY() { return y; }

    public void increaseX() {
        x++;
    }

    public void increaseY() {
        x++;
    }

    public void decreaseX() {
        x--;
    }

    public void decreaseY() {
        y--;
    }


}
