package oop.association.aggregation;

public class Teacher {

    private Integer id;
    private String name;
    private Course course;

    // no-args & all-args
    // getters & setters
    // toString

    public Teacher() {}

    public Teacher(Integer id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format(
          "Teacher{id = %d, name = %s, course = %s}",
          id, name, course
        );
    }

}
