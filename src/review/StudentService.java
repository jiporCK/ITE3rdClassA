package review;

import java.util.List;

public interface StudentService {

    // CRUD
    void createStudent(Student student);

    List<Student> getAllStudents();

}
