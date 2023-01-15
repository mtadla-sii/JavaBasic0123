package ch10_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex3_Academy {
    public static void main(String[] args) {
        Student adam = new Student("adam", "waw", 30);
        Student jan = new Student("jan", "lbl", 25);

        List<Student> students = new ArrayList<>();
        students.add(adam);
        students.add(jan);
        students.add(new Student("karol", "krk", 40));

        students.get(0).introduce();
        students.get(1).introduce();
        students.get(2).introduce();

        System.out.println("introduce inside loop");
        for (Student student : students) {
            student.introduce();
        }

    }
}
