public class Printer {
    int x=0;
    int y=1;

    void printMe(){
        System.out.println("x wynosi " + x);
        System.out.println("y wynosi " + y);
        System.out.println("jestem egzemplarezm klasy " + this.getClass().getName());
    }
}
