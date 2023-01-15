package ch14_ObjectAsFiled;

public class Ex2_Main {

    public static void main(String[] args) {
        Address address1 = new Address("3 maja", 15);
        Address address2 = new Address("krucza", 22);

        Building building = new Building("stocznia", address1);
        University university = new University("polibuda", address2, 123);

        System.out.println(building.getName());
        System.out.println(university.getName());
        System.out.println(building.getAddress().getStreet());
    }
}
