package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		double precoGasolina, pagamento, litro;
		
		System.out.println("Digite o preço do litro da gasolina:");
		precoGasolina = scan.nextDouble();
		
		System.out.println("Digite o preço de você quer abastecer: ");
		pagamento = scan.nextDouble();
		
		if (pagamento >= precoGasolina) {
			litro = pagamento / precoGasolina;
			System.out.printf("Litros de gasolina abastecido: %.1f%n", litro);
		} else {
			System.out.println("Valor insuficiente para abastecer!");
		}	
		
		scan.close();
	}
}

