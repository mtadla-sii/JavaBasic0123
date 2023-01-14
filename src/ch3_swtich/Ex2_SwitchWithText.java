package ch3_swtich;

import java.util.Scanner;

public class Ex2_SwitchWithText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prosze podaj nazwę przeglądarki");

        String browser = sc.nextLine();

        switch (browser) {
            case "chrome":
                System.out.println("chrome jest wspierany");
                break;
            case "firefox":
                System.out.println("firefox jest wspierany");
                break;
            default:
                System.out.println("ta przegarka nie jest wspierana: " + browser);
        }
        
        System.out.println("Koniec programu");
    }
}
