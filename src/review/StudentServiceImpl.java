package review;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private List<Student> studentDb = new ArrayList<>(
            List.of(
                    new Student(1, "Tony", "Stark",20.0),
                    new Student(2, "Bruce", "Wayne", 30.0),
                    new Student(3, "Ryan", "Gosling", 40.0)
            )
    );

    @Override
    public void createStudent(Student student) {
        studentDb.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDb;
    }

}
