package extend;

public class Manager extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int sex, int salary,int bonus) {
        super(name, sex, salary);
        this.bonus = (int) (bonus * Math.random());
    }

    @Override
    public int getSalary() {
        int baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
