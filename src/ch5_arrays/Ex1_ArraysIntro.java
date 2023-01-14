package ch5_arrays;

import java.util.Scanner;

public class Ex1_ArraysIntro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i: " + i);
            System.out.println(numbers[i]);
        }

        numbers[2] = 123;
        numbers[4] = 2;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for-each
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
