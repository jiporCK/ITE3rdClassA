package oop.encapsulation;

public class App {

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Koko Ma", 200.00, "Male");
        employee.setSalary(1000.00);
        System.out.println(employee);

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setFullName("Long Fou");
        employee1.setGender("Male");
        employee1.setSalary(3000.00);

        System.out.println(employee1);

    }

}
