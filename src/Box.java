import java.awt.*;

public class Box {
    int x1=0;
    int y1=0;
    int x2=0;
    int y2=0;

    Box buildBox(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;

        return this;

    }

    Box buildBox(Point topLeft, Point bottomRight){
        x1=topLeft.x;
        y1=topLeft.y;
        x2=bottomRight.x;
        y2=bottomRight.y;

        return this;
    }

    Box buildBox(Point topLeft, int w, int h){
        x1=topLeft.x;
        y1=topLeft.y;
        x2=(x1+w);
        y2=(y1+h);

        return this;
    }

    void printBox(){

        System.out.print("Box: < ");
        System.out.print(x1 + "," + y1);
        System.out.print(",");
        System.out.print(x2 + "," + y2);
        System.out.print(" > ");
    }
    public static void main(String[] args) {

        Box box=new Box ();
        System.out.println("Wywołanie buildBox ze współrzędnymi (25,25) i (55,55)");
        box.buildBox(25,25,55,55);
        box.printBox();

        System.out.println();

        System.out.println("Wywołanie buildBox z punktami:");
        box.buildBox(new Point (10,10), new Point(20,20));
        box.printBox();

        System.out.println();

        System.out.println("Wywołanie buildBox mieszanego: ");
        box.buildBox(new Point(12,12), 30, 40);
        box.printBox();

    }
}
