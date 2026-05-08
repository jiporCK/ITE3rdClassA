package review;

public class Rectangle {

    private Double width;
    private Double length;

    public Rectangle(Double width, Double length) {
        this.length = length;
        this.width = width;
    }

    public Double getArea() {
        return width*length;
    }
    public Double getPerimeter() {
        return 2*width + 2*length;
    }

}
