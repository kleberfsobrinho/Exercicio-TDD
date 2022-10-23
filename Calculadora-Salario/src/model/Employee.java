package model;

public class Employee {
    private String name;
    private String email;
    private Double salary;
    private Role role;

    public Employee(String name, String email, Double salary, Role role) {
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

    public Double getSalary() {
        return this.salary;
    }

    public Role getRole() {
        return this.role;
    }
}
