import java.awt.*;
import java.util.Objects;

public class Employee {
    String name;
    int wiek;
    int salary;

    public Employee(){}

    public Employee(String name, int wiek, int salary) {
        this.name = name;
        this.wiek = wiek;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wiek=" + wiek +
                ", salary=" + salary +
                '}';
    }
//public String toString(){
       // return this.getClass().getName() + "[imię i nazwisko: " +name + " wiek:  "+ wiek + " zarobki "+ salary + "]";
   // }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return wiek == employee.wiek &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }


    public static void main(String[] args) {

        Employee e1= new Employee("Jan Kowalski", 32, 2345);
        Employee e2= new Employee("Ewa Kowalski", 25, 1345);
        Employee e3= new Employee("Jan Kowalski", 32, 2345);

        Manager m1= new Manager("Mark Twain", 50, 6000, 3000);
        Manager m2= new Manager("Mark Twain", 50, 6000, 3000);
        Manager m3= new Manager("Jan Kowalski", 32, 2345, 3000);


        if (e1.equals(e3)){
            System.out.println("ta sama osoba");
        }else{
            System.out.println("różne osoby");
        }
    }
}

class Manager extends Employee {
    int bonusSalary;

    public Manager(String name, int wiek, int salary, int bonusSalary){
        super(name, wiek, salary);
        this.bonusSalary=bonusSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", wiek=" + wiek +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return bonusSalary == manager.bonusSalary;
    }

}