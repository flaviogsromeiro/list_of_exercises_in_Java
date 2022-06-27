package Dolar;

public class CurrencyConverter {

	public static double cotacao;
	
	public static double conversao(double dolar) {
		return cotacao * dolar - 6.0/100.0;
	}
	
}
