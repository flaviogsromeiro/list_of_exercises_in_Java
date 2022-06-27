package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		int qtdM, qtdG, qtdP;
		double totalP, totalM, totalG, totalVendida;
		
		System.out.print("Quantidades de camisetas P vendidas: ");
		qtdP = scan.nextInt();
		totalP = qtdP * 10.00;
		
		System.out.print("Quantidades de camisetas M vendidas: ");
		qtdM = scan.nextInt();
		totalM = qtdM * 12.00;
		
		System.out.print("Quantidades de camisetas G vendidas: ");
		qtdG = scan.nextInt();
		totalG = qtdG * 15.00;
		
		totalVendida = totalG + totalM + totalP;
		System.out.printf("Valor arrecadado: %.2f%n", totalVendida);
		
		scan.close();
	}
}
