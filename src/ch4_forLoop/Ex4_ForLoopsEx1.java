package ch4_forLoop;

public class Ex4_ForLoopsEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("the end");
    }
}
