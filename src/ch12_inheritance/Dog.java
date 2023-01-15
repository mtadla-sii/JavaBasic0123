package ch12_inheritance;

public class Dog extends Animal {

    private int height;

    public Dog(String name, int height) {
        super(name);
        this.height = height;
    }

    public void bark() {
        System.out.println("woof woof!");
    }

    public void introduce() {
        System.out.println("I'm dog, my name is " + getName() + " " + height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
