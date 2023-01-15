package ch10_lists;

public class Cable {
    String type;

    public Cable(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("type of cable: " + type);
    }
}
