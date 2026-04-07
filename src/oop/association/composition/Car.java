package oop.association.composition;

public class Car {

    private int id;
    private String model;
    private Engine engine;

    public Car(int id, String model, Engine engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
