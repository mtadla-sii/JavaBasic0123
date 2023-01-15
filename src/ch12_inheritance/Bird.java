package ch12_inheritance;

public class Bird extends Animal {
    private int wingspan;
    private boolean canFly;

    public Bird(String name, int wingspan, boolean canFly) {
        super(name);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public void introduce() {
        System.out.println("Im bird " + getName() + " wingspan " + wingspan);
    }

    public void fly() {
        if (canFly) {
            System.out.println("Ican fly");
        } else {
            System.out.println("I can't fly");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
