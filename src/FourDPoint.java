import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int v;

    public FourDPoint(int x, int y, int  z, int v){
        super(x,y);
        this.z=z;
        this.v=v;
    }

    public static void main(String[] args) {

        FourDPoint fourDPoint=new FourDPoint(3,4,5,6);
        System.out.println("Punkt 4D:");
        System.out.print("[");
        System.out.print( fourDPoint.x + ", "+ fourDPoint.y +", " +fourDPoint.z + ", "+ fourDPoint.v);
        System.out.print("]");

    }
}
