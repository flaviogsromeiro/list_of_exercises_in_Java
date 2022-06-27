package Dolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a cotação do dolar: R$ ");
		CurrencyConverter.cotacao = sc.nextDouble();

		System.out.print("Digite o valor do dólar para cotação: ");
		double dolar = sc.nextDouble();
		double dolarConvertido = CurrencyConverter.conversao(dolar);

		System.out.printf("TOTAL EM REAIS: R$ %.2f reais.", dolarConvertido);

		sc.close();
	}

}
