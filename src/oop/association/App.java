package oop.association;

import oop.association.aggregation.Course;
import oop.association.aggregation.Subject;
import oop.association.aggregation.Teacher;
import oop.association.composition.Car;
import oop.association.composition.Engine;

public class App {

    public static void main(String[] args) {

        Subject oop = new Subject(1, "OOP");
        Subject dataType = new Subject(2, "Data Types");

        Course java = new Course(
                1, "Java", new Subject[]{oop, dataType}
        );

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("Chan Chhaya");
        teacher.setCourse(java);

        System.out.println(teacher);

        Car car = new Car();
        car.setEngine(
                new Engine()
        );



    }

}
