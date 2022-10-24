package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import generator.Generator;
import model.Bill;
import model.Service;

public class Tests {
	
	@Test
    public void createBill() {
        Bill bill = new Bill("Luis Inacio Da Silva", "Rua Joao Agripino 80", Service.CONSULTORIA, 1500);

        assertEquals("Luis Inacio Da Silva", bill.getName());
        assertEquals("Rua Joao Agripino 80", bill.getAddress());
        assertEquals(Service.CONSULTORIA, bill.getService());
        assertEquals(1500, bill.getSalary());
    }

}