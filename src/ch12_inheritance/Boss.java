package ch12_inheritance;

public class Boss extends Employee {
    private int bonus;

    public Boss(String firstName, String lastName, int age, int salary, int bonus) {
        super(firstName, lastName, age, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
