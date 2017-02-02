package main;

public class Engine {

    private int power;
    private String type;
    private float capacity;

    public void setPower(int power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
