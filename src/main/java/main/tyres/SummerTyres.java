package main.tyres;

public class SummerTyres extends Tyres {

    private int width;

    public SummerTyres(int size, String name, int width) {
        super(size, name);
        this.width = width;

    }

    @Override
    public String toString() {
        return "SummerTyres{" +
                "width=" + width +
                '}';
    }
}
