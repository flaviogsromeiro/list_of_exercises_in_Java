package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_16 {

	// Duas fatias queijo e 1 presunto = 50 gramas cada;
	// Hambúrguer = 100 gramas;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double queijo = 0.1, presunto = 0.05, hamburguer = 0.1;
		double qtdSanduiches;

		System.out.println("Digite a quantidade de sanduiches: ");
		qtdSanduiches = scan.nextDouble();

		queijo = queijo * qtdSanduiches;
		presunto = presunto * qtdSanduiches;
		hamburguer = hamburguer * qtdSanduiches;

		System.out.printf("Quantidade em quilos de queijo %.2f%n", queijo);
		System.out.printf("Quantidade em quilos de presunto %.2f%n", presunto);
		System.out.printf("Quantidade em quilos de hambúrguer %.2f%n", hamburguer);

		scan.close();

	}
}
