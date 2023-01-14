package ch5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me lenght of array");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Please fill array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please give me number for index " + i);
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

            sum += numbers[i];
        }

        System.out.println("printing all elements from array:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Sum: " + sum);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("avg: " + sum / numbers.length);
    }
}
