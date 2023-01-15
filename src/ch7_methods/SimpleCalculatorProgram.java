package ch7_methods;

public class SimpleCalculatorProgram {
    public static void main(String[] args) {
        float x = UserInputHelper.getNumber();
        float y = UserInputHelper.getNumber();

        String selectedAction = UserInputHelper.getAction().toLowerCase().trim();

        switch (selectedAction) {
            case "add":
                float addResult = Calculator.add(x, y);
                System.out.println("wynik dodawania to: " + addResult);
                break;
            case "subtract":
                float subtractResult = Calculator.subtract(x, y);
                System.out.println("wynik odejmowania to: " + subtractResult);
                break;
            case "multiply":
                float multiplyResult = Calculator.multiply(x, y);
                System.out.println("wynik mnożenia to: " + multiplyResult);
                break;
            case "divide":
                float divideResult = Calculator.divide(x, y);
                System.out.println("wynik dzielenia to: " + divideResult);
                break;
            default:
                System.out.println("wybrałes nieporawna opcje");
        }
    }
}
