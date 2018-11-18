package extend;

public class Employee {
    private String name;
    private int sex;
    private int salary;

    public Employee(String name, int sex, int salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary,int pyDeal){
        this.salary = salary + pyDeal;
    }
}
