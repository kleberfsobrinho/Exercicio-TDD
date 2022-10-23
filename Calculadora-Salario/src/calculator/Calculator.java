package calculator;

import model.Employee;

public class Calculator {
    public static Double calculateSalary(Employee employee) {
        if (employee.getSalary() < 3000)
            return employee.getSalary() - employee.getSalary() * 0.10;

        return employee.getSalary() - employee.getSalary() * 0.20;
    }
}
