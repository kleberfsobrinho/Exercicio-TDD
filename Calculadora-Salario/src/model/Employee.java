package model;

public class Employee {
    private String name;
    private String email;
    private Integer salary;
    private String role;

    public Employee(String name, String email, Integer salary, String role) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public Integer getSalary() {
        return this.salary;
    }
}
