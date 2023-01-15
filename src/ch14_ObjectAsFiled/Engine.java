package ch14_ObjectAsFiled;

public class Engine {
    private int horsePower;
    private String fuel;

    public Engine(int horsePower, String fuel) {
        this.horsePower = horsePower;
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
