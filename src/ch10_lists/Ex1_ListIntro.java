package ch10_lists;


import java.util.ArrayList;
import java.util.List;

public class Ex1_ListIntro {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mateusz");
        names.add("Karol");
        names.add("Barbara");
        names.add("Adam");

        System.out.println(names.size());

        System.out.println(names.get(1));

        System.out.println("usuwam element na indeksie 0");
        names.remove(0);

        System.out.println(names.size());

        System.out.println(names.get(1));

        System.out.println("Pring all names using for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Pring all names using for-each loop");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
