package main;

import main.tyres.Tyres;


public class Wheels {

    private Tyres tyres;
    private String disk;

    public Wheels(Tyres tyres, String disk) {
        this.disk = disk;
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "tyres=" + tyres +
                ", disk='" + disk + '\'' +
                '}';
    }
}
