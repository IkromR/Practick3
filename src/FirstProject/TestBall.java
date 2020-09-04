package FirstProject;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Yellow", 5);
        Ball d2 = new Ball("Black", 13);
        Ball d3 = new Ball("Green");
        d3.setHit(1);
        System.out.println(d1);
        d1.hitTheBall();
        d2.hitTheBall();
        d3.hitTheBall();
    }
}
