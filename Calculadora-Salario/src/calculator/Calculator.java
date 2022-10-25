package calculator;

import model.Employee;
import model.Role;

public class Calculator {
    static final Double DESENVOLVEDOR_THRESHOLD = 3000.00;
    static final Double DBA_TESTADOR_THRESHOLD = 2000.00;
    static final Double GERENTE_THRESHOLD = 5000.00;
    static final Double DESENVOLVEDOR_SALARY_LESS_THRESHOLD = 0.10;
    static final Double DESENVOLVEDOR_SALARY_MORE_THRESHOLD = 0.20;
    static final Double DBA_TESTADOR_SALARY_LESS_THRESHOLD = 0.15;
    static final Double DBA_TESTADOR_SALARY_MORE_THRESHOLD = 0.25;
    static final Double GERENTE_SALARY_LESS_THRESHOLD = 0.20;
    static final Double GERENTE_SALARY_MORE_THRESHOLD = 0.30;

    public static Double calculateSalary(Employee employee) {
        Double percentage;

        if (employee.getRole().equals(Role.DESENVOLVEDOR)) {
            if (employee.getSalary() < DESENVOLVEDOR_THRESHOLD)
                percentage = DESENVOLVEDOR_SALARY_LESS_THRESHOLD;
            else
                percentage = DESENVOLVEDOR_SALARY_MORE_THRESHOLD;
        }
        else if (employee.getRole().equals(Role.DBA) || employee.getRole().equals(Role.TESTADOR)) {
            if (employee.getSalary() < DBA_TESTADOR_THRESHOLD)
                percentage = DBA_TESTADOR_SALARY_LESS_THRESHOLD;
            else
                percentage = DBA_TESTADOR_SALARY_MORE_THRESHOLD;
        }
        else {
            if (employee.getSalary() < GERENTE_THRESHOLD)
                percentage = GERENTE_SALARY_LESS_THRESHOLD;
            else
                percentage = GERENTE_SALARY_MORE_THRESHOLD;
        }

        return employee.getSalary() - employee.getSalary() * percentage;
    }
}
