package main.tyres;

 abstract public class Tyres {

    private int size;
    private String name;

    public Tyres(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tyres{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
