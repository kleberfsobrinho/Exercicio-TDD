package calculator;

import model.Employee;
import model.Role;

public class Calculator {
    public static Double calculateSalary(Employee employee) {
        if (employee.getRole().equals(Role.DESENVOLVEDOR)) {
            if (employee.getSalary() < 3000)
                return employee.getSalary() - employee.getSalary() * 0.10;

            return employee.getSalary() - employee.getSalary() * 0.20;
        }

        return employee.getSalary() - employee.getSalary() * 0.15;
    }
}
