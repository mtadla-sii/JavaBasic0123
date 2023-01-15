package ch12_inheritance;

public class Hospital {

    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowal", 25, 1000);
        Boss boss = new Boss("Adam", "Nowak", 25, 1000, 500);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());

        System.out.println(boss.getFirstName());
        System.out.println(boss.getLastName());
        System.out.println(boss.getBonus());

    }
}
