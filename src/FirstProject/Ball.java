package FirstProject;
import java.lang.*;

public class Ball {
    private int hit;
    private String color;

    public Ball(String c, int h) {
        color = c;
        hit = h;
    }

    public Ball(String c) {
        color = c;
        hit  = 0 ;
    }

    public Ball() {
        color = "red";
        hit  = 0 ;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHit() {
        return hit;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.color+", hit "+ this.hit;
    }

    public void hitTheBall() {
        System.out.println("Human hit the ball "+hit+" times"+" and the color of the ball was "+color);
    }
}
