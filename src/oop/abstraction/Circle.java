package oop.abstraction;

public class Circle extends Shape implements Measurable {

    private Double radius;

    public Circle(String type, Double radius) {
        super(type);
        this.radius = radius;
    }
    public Circle() {}

    @Override
    public void showInfo() {
        System.out.printf("""
                ++++++++++++++++++++++++++++++++++
                %s { radius = %.2f }
                Area      = %.2f
                Perimeter = %.2f
                """, getType(), radius, area(), perimeter());
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
