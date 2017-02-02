package main.tyres;

public class WinterTyres extends Tyres {

    private Boolean spike;

    public WinterTyres(int size, String name, Boolean spike) {
        super(size, name);
        this.spike = spike;
    }

    @Override
    public String toString() {
        return "WinterTyres{" +
                "spike=" + spike +
                '}';
    }
}
