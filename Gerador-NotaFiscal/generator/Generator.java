package generator;

import model.Bill;
import model.Service;

public class Generator {
	String clientName;
	Double valueBill;
	static Double fee;

	public Generator(Bill bill) {
		super();
		this.clientName = bill.getName();
		this.valueBill = bill.getSalary();
	}

	public static Double calculateTaxes(Bill bill) {
		 if (bill.getService().equals(Service.CONSULTORIA)) {
			 fee = bill.getSalary() * 0.25;
			 return fee;
	        }
		 else if (bill.getService().equals(Service.TREINAMENTO)) {
			 fee = bill.getSalary() * 0.15;
			 return fee;
		 }
		 else {
			 fee = bill.getSalary() * 0.6;
			 return fee;
		 }
	}

}
