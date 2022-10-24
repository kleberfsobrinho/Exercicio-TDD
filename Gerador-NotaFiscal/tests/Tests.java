package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import generator.Generator;
import model.Bill;
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
	
	@Test
	public void calculateTaxesOutro() {
		Bill bill = new Bill("Pato Donald Siqueira", "Walt Disney World Orlando 70", Service.OUTRO, 3000.00);
        Double taxes = Generator.calculateTaxes(bill);
        assertEquals(1800, taxes);
	}
	
	@Test
	public void generateBill() {
		Bill bill = new Bill("Chiquinha", "Turma do chaves", Service.CONSULTORIA, 1600.00);
		assertEquals("Chiquinha", bill.getName());
		assertEquals("Turma do chaves", bill.getAddress());
		assertEquals(Service.CONSULTORIA, bill.getService());
		assertEquals(1600.00, bill.getSalary());
		assertEquals(400, Generator.calculateTaxes(bill));
	}
}