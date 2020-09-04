package FirstProject;
import java.lang.*;

public class TestBooks {
    public static void main(String[] args) {
        Books d1 = new Books("Poor dad, Rich dad", 5);
        Books d2 = new Books("In the bowels of the earth", 13);
        Books d3 = new Books("Way to space");
        d3.setReadBooks(1);
        System.out.println(d1);
        d1.visitsPerWeek();
        d2.visitsPerWeek();
        d3.visitsPerWeek();
    }
}
