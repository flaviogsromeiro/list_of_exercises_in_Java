package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		double xA, yA, xB, yB, distancia;
		
		System.out.println("Digite as coordenadas do ponto A:");
		xA = scan.nextDouble();
		yA = scan.nextDouble();
		
		System.out.println("Digite as coordenadas do ponto B: ");
		xB = scan.nextDouble();
		yB = scan.nextDouble();
		
		distancia = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
		
		System.out.println("Distância entre os pontos A e B: " + distancia);
		
		scan.close();
	}
}
