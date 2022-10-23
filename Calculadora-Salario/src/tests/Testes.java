package tests;

import model.Employee;
import model.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {
    @Test
    public void createEmployee() {
        Employee employee = new Employee("Rhaenyra Targaryen", "rhaenyra.targaryen@gmail.com", 2000.00, Role.DESENVOLVEDOR);

        assertEquals("Rhaenyra Targaryen", employee.getName());
        assertEquals("rhaenyra.targaryen@gmail.com", employee.getEmail());
        assertEquals(2000, employee.getSalary());
        assertEquals(Role.DESENVOLVEDOR, employee.getRole());
    }

    @Test
    public void calculateSalaryDesenvolvedorLessThan3000() {
        Employee employee = new Employee("Rhaenyra Targaryen", "rhaenyra.targaryen@gmail.com", 2999.99, Role.DESENVOLVEDOR);
        Double netSalary = Calculator.calculateSalary(employee);
        assertEquals(employee.getSalary() - employee.getSalary() * 0.1, netSalary);
    }
}
