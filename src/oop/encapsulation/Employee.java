package oop.encapsulation;

public class Employee {

    private Integer id;
    private String fullName;
    private Double salary;
    private String gender;

    public Employee() {}

    public Employee(Integer id, String fullName, Double salary, String  gender) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Double getSalary() {
        return salary;
    }

    public String  getGender() {
        return gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }

}
