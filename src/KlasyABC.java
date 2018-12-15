import java.util.Scanner;

public class KlasyABC {
    public static void main(String[] args) {

        new C();
        Scanner in= new Scanner(System.in);
        System.out.println("Podaj naze klasy którą chcesz wywołać");
        String nazwaKlasy=in.nextLine();

        if (nazwaKlasy =="AA"){
            AA aa=new AA();
            System.out.println("klasa AA");
        }
        else if (nazwaKlasy=="BB"){
            BB bb=new BB();
            System.out.println("klasa BB");
        }
        else if (nazwaKlasy=="CC"){
            CC cc=new CC();
            System.out.println("klasa CC");
        }
        else{
            System.out.println("Niepoprawna wartość.");
        }
    }
}

class AA{
    public AA(){
        System.out.println("Klasa AA");
    }
}

class BB extends AA {
    public  BB (){
        System.out.println("Klasa BB");
    }
}

class CC extends BB {
    public CC(){
        System.out.println("Klasa CC");
    }
}
