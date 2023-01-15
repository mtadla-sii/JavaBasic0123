package ch11_private;

public class Ex1_AcademyMain {
    public static void main(String[] args) {
        Academy academy = new Academy("Politechnika", "Lbl");

        System.out.println(academy.getName());
        System.out.println(academy.getAddress());

        academy.printInfo();
    }
}
