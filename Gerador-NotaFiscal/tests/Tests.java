package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.Calculator;
import generator.Generator;
import model.Bill;
import model.Employee;
import model.Role;
import model.Service;

public class Tests {
	
	@Test
    public void createBill() {
        Bill bill = new Bill("Luis Inacio Da Silva", "Rua Joao Agripino 80", Service.CONSULTORIA, 1500.00);

        assertEquals("Luis Inacio Da Silva", bill.getName());
        assertEquals("Rua Joao Agripino 80", bill.getAddress());
        assertEquals(Service.CONSULTORIA, bill.getService());
        assertEquals(1500, bill.getSalary());
    }
	
	@Test
	public void calculateTaxesConsultoria() {
        Bill bill = new Bill("Luis Inacio Da Silva", "Rua Joao Agripino 80", Service.CONSULTORIA, 1500.00);
        Double taxes = Generator.calculateTaxes(bill);
        assertEquals(375, taxes);
    }
	
	@Test
	public void calculateTaxesTreinamento() {
		Bill bill = new Bill("Klebinho Sobrinho Cabelinho", "Rua da Consolação 40", Service.TREINAMENTO, 2400.00);
        Double taxes = Generator.calculateTaxes(bill);
        assertEquals(360, taxes);
	}
}