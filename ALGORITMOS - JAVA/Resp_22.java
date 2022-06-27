package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_22 {

	public static void main(String[] args) {

		// 1, 5, 10, 25 e 50 centavos;

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double moeda1, moeda5, moeda10, moeda25, moeda50;
		double totalReal;

		System.out.println("Quantas moedas de 1 centavos foram depositadas ?");
		moeda1 = scan.nextInt();
		moeda1 = moeda1 * 0.01;

		System.out.println("Quantas moedas de 5 centavos foram depositadas ?");
		moeda5 = scan.nextInt();
		moeda5 = moeda5 * 0.05;

		System.out.println("Quantas moedas de 10 centavos foram depositadas ?");
		moeda10 = scan.nextInt();
		moeda10 = moeda10 * 0.10;

		System.out.println("Quantas moedas de 25 centavos foram depositadas ?");
		moeda25 = scan.nextInt();
		moeda25 = moeda25 * 0.25;

		System.out.println("Quantas moedas de 50 centavos foram depositadas ?");
		moeda50 = scan.nextInt();
		moeda50 = moeda50 * 0.50;

		totalReal = (moeda1 + moeda5 + moeda10 + moeda25 + moeda50);

		System.out.printf("TOTAL EM REAL: R$ %.2f reais.", totalReal);

		scan.close();
	}
}
