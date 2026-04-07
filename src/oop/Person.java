package oop;

import java.time.LocalDate;

public class Person {

    // fields
    int id;
    String name;
    double salary;

    // methods
    public Person() {
        this.id = 0;
        this.name = "N/A";
        this.salary = 0.0;
    }
    public Person(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }
    public Person(int id, String name, double salary) {
        this(name, salary);
        this.id = id;
    }

    public void info() {
        System.out.println("====== [Person Info] ======");
        System.out.println("Person id: " + id);
        System.out.println("Person name: " + name);
        System.out.println("Person salary: " + salary);
    }

    public boolean isWarning() {
        return salary < 200.00;
    }

    public void increaseSalary(double salary) {
        this.salary += salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
