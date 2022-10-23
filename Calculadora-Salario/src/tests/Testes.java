package tests;

import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    public void createEmployee() {
        Employee employee = new Employee("Rhaenyra Targaryen", "rhaenyra.targaryen@gmail.com", 2000, "Cargo");

        assertEquals("Rhaenyra Targaryen", employee.getName());
        assertEquals("rhaenyra.targaryen@gmail.com", employee.getEmail());
        assertEquals(2000, employee.getSalary());
    }

}
