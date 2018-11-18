import extend.Employee;
import extend.Manager;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee("wang",1,1111);
        Manager m = new Manager("hong",1,7777,1000);

        Employee e1 = new Manager("wang",1,1234,1000);
        System.out.println(e.getSalary());
        System.out.println(m.getSalary());
    }
}
