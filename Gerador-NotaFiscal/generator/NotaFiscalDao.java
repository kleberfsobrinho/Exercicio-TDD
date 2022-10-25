package generator;

import model.Bill;

public class NotaFiscalDao {
	private static Bill notaFiscal;
	
	public static String salva(Bill nf) { 
		notaFiscal = nf;
		return "salvando no banco";
	}

	public static Bill getNotaFiscal() {
		return notaFiscal;
	}
	
}
