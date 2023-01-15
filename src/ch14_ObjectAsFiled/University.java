package ch14_ObjectAsFiled;

public class University extends Building {
    private int numberOfStudents;

    public University(String name, Address address, int numberOfStudents) {
        super(name, address);
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
