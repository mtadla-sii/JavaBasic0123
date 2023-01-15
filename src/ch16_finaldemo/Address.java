package ch16_finaldemo;

public class Address {

    private String street;
    private int houseNumber;
    private City city;

    public Address(String street, int houseNumber, City city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    public void printAddress() {
        System.out.println(city.getName() + " " + street + " " + houseNumber);
    }
}
