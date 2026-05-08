package review;

public class App {

    public static void main(String[] args) {

        // create object of studentserviceimpl
        // call both methods

        StudentService service = new StudentServiceImpl();

        Student student = new Student(
                4, "Robert", "Ratanak", 50.0
        );

        service.createStudent(student);
        System.out.println(
                service.getAllStudents()
        );


        Rectangle rect = new Rectangle(12.0, 15.0);
        System.out.println(
                "Area = " + rect.getArea() +
                        "\nPerimeter = " + rect.getPerimeter()
        );

    }
}
