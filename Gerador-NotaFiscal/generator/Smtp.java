package generator;

import model.Bill;

public class Smtp {
	private static Bill notaFiscal;

	public static String envia(Bill nf) { 
		notaFiscal = nf;
		return "enviando por Smtp";
	}
	
	public static Bill getNotaFiscal() {
		return notaFiscal;
	}
}
