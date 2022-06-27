package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		int numero, centena = 0, dezena = 0, unidade = 0;
		
		System.out.println("Digite um numero:");
		numero = scan.nextInt();
		
		if(numero < 1000) {
			
			if (numero >= 100) {
				centena = numero / 100;
				dezena = (numero % 100) / 10;
				unidade = (numero % 100) % 10;
			}else {
				centena = 0;
				dezena = numero / 10;
				unidade = numero % 10;
				
			}if (numero < 10) {
				centena = 0;
				dezena = 0;
				unidade = numero;
			}
		
			System.out.println("CENTENA = " + centena);
			System.out.println("DEZENA = " + dezena);
			System.out.println("UNIDADE = " + unidade);
			
		}else {
			System.out.println("Valor inválido!");
		}

		scan.close();
	}
}
