package ch11_private;

public class Academy {
    private String name;
    private String address;

    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo() {
        printName();
        printAddress();
    }

    private void printName() {
        System.out.println("Academy address: " + name);
    }

    private void printAddress() {
        System.out.println("Academy address: " + address);
    }
}
