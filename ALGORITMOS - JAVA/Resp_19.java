package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_19 {

	public static void main(String[] args) {

		// Direito > 1x Identificação - 4,00;
		// Esquerdo > 2x Alimento - 3,50;

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int qtdGalinha;
		double gasto;

		System.out.println("Quantas galinhas tem na granja ?");
		qtdGalinha = scan.nextInt();

		if (qtdGalinha > 0) {
			gasto = (4.00 + 3.50) * qtdGalinha;
			System.out.printf("Gasto total = R$ %.2f reais. %n", gasto);
		} else {
			System.out.println("Valor inválido!");

		}

		scan.close();
	}
}
