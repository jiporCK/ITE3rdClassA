package oop.association.composition;

public class Engine {

    private int id;
    private double horsePower;

    public Engine(int id, double horsePower) {
        this.id = id;
        this.horsePower = horsePower;
    }

    public Engine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", horsePower=" + horsePower +
                '}';
    }

}
