package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		double medida1, medida2, area;
		
		System.out.println("Digite as dimensões do terreno:");
		medida1 = scan.nextDouble();
		medida2 = scan.nextDouble();
		
		area = medida1 * medida2;
		
		System.out.println("A área do terreno é " + area + " m2.");
		
		scan.close();
	}
}
