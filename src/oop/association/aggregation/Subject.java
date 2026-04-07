package oop.association.aggregation;

public class Subject {

    private Integer id;
    private String lesson;

    public Subject() {}

    public Subject(Integer id, String lesson) {
        this.id = id;
        this.lesson = lesson;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", lesson='" + lesson + '\'' +
                '}';
    }

}
