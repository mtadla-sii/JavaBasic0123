package ch16_finaldemo;

import java.util.List;

public class Email {
    private String content;
    private String title;

    private Person sender;

    private List<Person> recipients;

    public Email(String content, String title, Person sender, List<Person> recipients) {
        this.content = content;
        this.title = title;
        this.sender = sender;
        this.recipients = recipients;
    }

    public void sendEmail() {
        System.out.println("sending email from: ");
        sender.printInfo();

        System.out.println("\r\nsending email to: ");

        for (Person person : recipients) {
            person.printInfo();
        }

        System.out.println("\nwith title: " + title);
        System.out.println("\nwith content: ");
        System.out.println(content);

    }
}
