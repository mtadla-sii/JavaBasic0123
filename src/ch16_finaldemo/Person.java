package ch16_finaldemo;

public class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Address address;

    public Person(String firstName, String lastName, String emailAddress, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + " " + emailAddress);
        address.printAddress();
    }
}
