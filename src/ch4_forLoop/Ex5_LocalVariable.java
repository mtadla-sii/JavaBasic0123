package ch4_forLoop;

public class Ex5_LocalVariable {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("I'm inside loop");
            System.out.println(i);
        }

        System.out.println("Value i at the end was: " + i);
        System.out.println("the end");
    }
}
