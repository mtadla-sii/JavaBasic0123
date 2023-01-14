package ch4_forLoop;

public class Ex9_BreakLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 3) {
                break;
            }
        }

        System.out.println("the end");
    }
}
