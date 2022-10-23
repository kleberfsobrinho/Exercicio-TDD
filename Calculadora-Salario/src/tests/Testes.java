package tests;

import calculator.Calculator;
import model.Employee;
import model.Role;
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
        Employee employee = new Employee("Alicent Hightower", "alicent.hightower@gmail.com", 2999.99, Role.DESENVOLVEDOR);
        Double netSalary = Calculator.calculateSalary(employee);
        assertEquals(2699.991, netSalary);
    }

    @Test
    public void calculateSalaryDesenvolvedorGreaterOrEqual3000() {
        Employee employeeEqual = new Employee("Daemon Targaryen", "daemon.targaryen@gmail.com", 3000.00, Role.DESENVOLVEDOR);
        Double netSalary = Calculator.calculateSalary(employeeEqual);
        assertEquals(2400, netSalary);

        Employee employeeGreater = new Employee("Daemon Targaryen", "daemon.targaryen@gmail.com", 3001.00, Role.DESENVOLVEDOR);
        netSalary = Calculator.calculateSalary(employeeGreater);
        assertEquals(2400.8, netSalary);
    }

    @Test
    public void calculateSalaryDBALessThan2000() {
        Employee employee = new Employee("Alicent Hightower", "alicent.hightower@gmail.com", 1999.99, Role.DBA);
        Double netSalary = Calculator.calculateSalary(employee);
        assertEquals(1699.9915, netSalary);
    }
}
