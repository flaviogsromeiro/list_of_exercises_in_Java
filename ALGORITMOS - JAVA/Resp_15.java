package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		double valorConta, dividido, valorFelipe;
		
		System.out.println("Digite o valor total da conta:");
		valorConta = scan.nextDouble();
		
		dividido = (int) valorConta / 3;
		valorFelipe = (valorConta % 3) + dividido;
		
		System.out.printf("Carlos R$ %.2f%n", dividido);
		System.out.printf("André R$ %.2f%n", dividido);
		System.out.printf("Felipe R$ %.2f%n", valorFelipe);
		
		scan.close();
	}
}
