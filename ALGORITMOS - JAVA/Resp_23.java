package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int a, b, c, somaAB;

		System.out.println("Digite 3 número:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		somaAB = a + b;

		if (somaAB < c) {
			System.out.println("A + B resulta em " + somaAB + " logo, é menor que C = " + c);
		} else {
			System.out.println("Comparação inválida.");
		}

		scan.close();
	}
}
