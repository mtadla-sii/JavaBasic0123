package ch16_finaldemo;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {
    public static void main(String[] args) {
        Address address = new Address("krucz", 13, new City("waw"));
        Person sender = new Person("Jan", "Kowal", "j.k@wp.pl", address);

        Person recipient1 = new Person("Adamn", "Kowal", "j.k@wp.pl", address);


        Person recipient2 = new Person("Karol", "Nowak", "jqwek@wp.pl", new Address("3 maja", 123, new City("krk")));


        Person recipient3 = new Person("Mat", "l", "j123@wp.pl", new Address("pils", 42, new City("lbl")));

        List<Person> recipients = new ArrayList<>();
        recipients.add(recipient1);
        recipients.add(recipient2);
        recipients.add(recipient3);

        Email email = new Email("asdzxc", "123", sender, recipients);
        email.sendEmail();
    }
}
