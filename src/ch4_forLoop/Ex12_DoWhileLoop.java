package ch4_forLoop;

public class Ex12_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("first do while loop with 'i'");
        int i = 0;

        do {
            System.out.println("value of i: " + i);
            i++;
        } while (i < 10);

        System.out.println("sencond do while loop with 'j'");
        int j = 11;

        do {
            System.out.println("value of j: " + j);
            j++;
        } while (j < 10);

        System.out.println("the end");
    }
}
