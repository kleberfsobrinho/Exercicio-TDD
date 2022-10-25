package generator;

import model.Bill;

public class SAP {
	private static Bill notaFiscal;
	
	public static String envia(Bill nf) { 
		notaFiscal = nf;
		return "enviando por email";
	}

	public static Bill getNotaFiscal() {
		return notaFiscal;
	}
}
