package ch10_lists;

public class Student {
    String name;
    String city;
    int age;

    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void introduce() {
        System.out.println("my name is: " + name + " age: " + age);
    }
}
