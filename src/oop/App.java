package oop;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

//        Person person = new Person();
//        person.id = 1;
//        person.name = "Bruce Banner";
//        person.salary = 3000.00;
//
//        System.out.printf("""
//                Person name is %s
//                Person id is %d
//                Person salary is %.2f
//                """, person.name, person.id, person.salary);
//
//        Person person2 = new Person(2, "Tony Stark", 400);
//        person2.info();
//
//        Person person3 = new Person("Steve Rogers", 5555);
//        person3.info();
//
//

        Person[] people = new Person[4];
        people[0] = new Person(1, "Tony Stark", 4444);
        people[1] = new Person(2, "Thor", 5555);
        people[2] = new Person(3, "Steve Rogers", 6666);
        people[3] = new Person(4, "Sreng Chipor", 150);

        for (Person person : people) {
            person.id++;
            person.info();
        }

        Scanner scanner = new Scanner(System.in);
        for (Person person : people) {
            if (person.isWarning()) {
                System.out.println("Increase salary for " + person.name);
                System.out.print("[+] Value to increase: ");
                double salary = scanner.nextDouble();
                person.increaseSalary(salary);
            }
        }

        for (Person person : people) {
            person.info();
        }

        // int age;
        //Person person;

    }

}
