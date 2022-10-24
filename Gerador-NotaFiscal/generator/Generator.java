package generator;

import model.Bill;
import model.Service;

public class Generator {
	String clientName;
	int value;
	int fee;

	public Generator(String clientName, int value, int fee) {
		super();
		this.clientName = clientName;
		this.value = value;
		this.fee = fee;
	}

	public static Double calculateTaxes(Bill bill) {
		 if (bill.getService().equals(Service.CONSULTORIA)) {
			 return bill.getSalary() * 0.25;
	        }
		return null;
	}

}
