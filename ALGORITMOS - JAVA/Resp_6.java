package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		double quiloPrato, valorPagar, preco = 12.0;
		
		System.out.println("Digite o peso do seu prato: ");
		quiloPrato = scan.nextDouble();
		valorPagar = quiloPrato * preco;
		
		System.out.printf("Valor a pagar: %.2f%n", valorPagar, " reais.");
		
		scan.close();
	}
}
