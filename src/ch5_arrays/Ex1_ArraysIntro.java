package ch5_arrays;

public class Ex1_ArraysIntro {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i: " + i);
            System.out.println(numbers[i]);
        }

        numbers[2] = 123;
        numbers[4] = 2;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i: " + i);
            System.out.println(numbers[i]);
        }
    }
}
