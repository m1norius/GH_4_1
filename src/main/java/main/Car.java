package main;

public class Car {

    private Wheels wheels;
    private Engine engine;

    public Car(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }
}


