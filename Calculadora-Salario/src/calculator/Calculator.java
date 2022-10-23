package calculator;

import model.Employee;

public class Calculator {
    public static Double calculateSalary(Employee employee) {
        return employee.getSalary() - employee.getSalary() * 0.10;
    }
}
