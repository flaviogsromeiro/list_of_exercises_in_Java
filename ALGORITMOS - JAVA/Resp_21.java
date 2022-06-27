package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_21 {

	public static void main(String[] args) {

		// Lata = 350 ml;
		// Garrafa = 600 ml;
		// GarrafaPet = 2 l;

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double lata, garrafa, garrafaPet, totalLitros;

		System.out.print("Digite a quantidade refrigerantes Meia-Cola do tipo LATA foram compradas: ");
		lata = scan.nextDouble();

		System.out.print("Digite a quantidade refrigerantes Meia-Cola do tipo GARRAFA foram compradas: ");
		garrafa = scan.nextDouble();

		System.out.print("Digite a quantidade refrigerantes Meia-Cola do tipo GARRAFA PET foram compradas: ");
		garrafaPet = scan.nextDouble();

		totalLitros = ((((lata * 350) + (garrafa * 600)) / 1000) + (garrafaPet * 2));

		System.out.printf("TOTAL DE LITROS DE REFRI COMPRADOS: %.2f litros.", totalLitros);

		scan.close();
	}
}
