import java.awt.*;

public class NamePoint extends Point {
    String name;

    public NamePoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamePoint namePoint=new NamePoint(5,5,"small point");
        System.out.println("x wynosi "+ namePoint.x);
        System.out.println("y wynowi "+ namePoint.y);
        System.out.println(" name wynosi " + namePoint.name);
    }
}
