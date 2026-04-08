package oop.abstraction;

public class Rectangle extends Shape {

    private Double length; // long side
    private Double width; // short side

    public Rectangle() {}
    public Rectangle(String type, Double length, Double width) {
        super(type);
        this.length = length;
        this.width = width;
    }

    @Override
    public void showInfo() {
        System.out.printf("""
                ++++++++++++++++++++++++++++++++++
                %s { length = %.2f, width = %.2f }
                Area      = %.2f
                Perimeter = %.2f
                """, getType(), length, width, area(), perimeter());
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
