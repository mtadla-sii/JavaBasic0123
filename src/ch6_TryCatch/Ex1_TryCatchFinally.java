package ch6_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int i = sc.nextInt();
            System.out.println(10 / i);
        } catch (InputMismatchException e) {
            System.out.println("Wybacz ale nie podałeś liczby");
        } catch (ArithmeticException e) {
            System.out.println("wybcza ale nie mozesz dzielic przez 0");
        } finally {
            System.out.println("ja wykonam sie zawsze");
        }

        System.out.println("Koniec programu");
    }
}
