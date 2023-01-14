package ch5_arrays;

import java.util.Scanner;

public class Ex3_ArraySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at i: " + i + " = " + numbers[i]);
        }
    }
}
