package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		final double pi = 3.14;
		double raio, area;
		
		System.out.println("Digite o raio da pizza:");
		raio = scan.nextDouble();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf("Área da pizza: %.2f%n", area);
		
		scan.close();
	}
}
