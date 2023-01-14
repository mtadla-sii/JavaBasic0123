package ch4_forLoop;

public class Ex6_LoopsWithSum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("sum: " + sum);
    }
}
