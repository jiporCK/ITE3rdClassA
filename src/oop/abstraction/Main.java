package oop.abstraction;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle("Circle", 12.13);
        Shape rectangle = new Rectangle("Rectangle", 24.00, 16.15);

        circle.showInfo();
        rectangle.showInfo();

    }

}
