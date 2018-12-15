public class Smple {
    public static void main(String[] args) {

        new A();
        //new A(1);
        //new A("raz");
        new B();
        new C();
    }
}

class A{

    A (){
        System.out.println("A");
    }
    A (int i){
        System.out.println("działa konstruktor z int:" + i);
    }
    A (String str){
        System.out.println("działa konstruktor ze string: " + str);
    }

}

class C extends B {
    public C() {
        {
            System.out.println("konstruuje C");
        }
    }
}
class B extends A {
    public B() {
        {
            System.out.println("B");
        }
    }


}