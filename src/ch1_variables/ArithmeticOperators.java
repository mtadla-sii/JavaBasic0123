package ch1_variables;

public class ArithmeticOperators {


    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int z = 10 + 5;
        int k = x + y + 1;
        System.out.println(z);
        System.out.println(k);

        System.out.println(x - 2);
        System.out.println(x * 2);
        System.out.println(x / y);
        System.out.println(10 % 3);

        int a = 5;
        System.out.println(a); // 5

        a = a + 1;
        System.out.println(a); // 6

        a += 3;
        System.out.println(a); // 9

        a++;  // ten zapis robi to samo co 'a += 1' oraz 'a = a + 1'
        System.out.println(a); // 10

        a--;
        System.out.println(a); // 9


    }

}
