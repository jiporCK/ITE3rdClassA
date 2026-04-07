package oop.association.aggregation;

import java.util.Arrays;

public class Course {

    private Integer id;
    private String name;
    private Subject[] subjects;

    public Course() {

    }

    public Course(Integer id, String name, Subject[] subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
