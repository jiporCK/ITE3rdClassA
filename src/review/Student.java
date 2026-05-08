package review;

import lombok.ToString;

public class Student {

    private Integer id;
    private String firstName;
    private String lastName;
    private Double score;

    // getter & setter

    public Student(Integer id, String firstName, String lastName, Double score) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format(
                "Student{id = %d, fullName = %s, score = %.2f}\n",
                id, firstName+" "+lastName, score
        );
    }

}
