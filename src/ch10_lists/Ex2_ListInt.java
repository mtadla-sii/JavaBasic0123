package ch10_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ListInt {
    public static void main(String[] args) {
        // Interger -> typ opakowujący 'int'
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);

        System.out.println(numbers.get(1));

    }
}
