package ch7_methods;

public class Ex3_Calculator {

    public static void main(String[] args) {
        int x = UserInputHelper.getNumber();
        int y = UserInputHelper.getNumber();

        System.out.println("wynik dodawania to: " + Calculator.add(x, y));

        Calculator.add(UserInputHelper.getNumber(), UserInputHelper.getNumber());

        Calculator.add(Calculator.add(UserInputHelper.getNumber(), y), Calculator.add(x, x));
    }
}
