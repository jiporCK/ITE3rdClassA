package oop.abstraction;

public abstract class Shape {

    private String type;

    public Shape() {}
    public Shape(String type) {
        this.type = type;
    }

    public void showInfo() {
        System.out.println("Type of shape is: " + type);
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public abstract double area();
    public abstract double perimeter();

}
