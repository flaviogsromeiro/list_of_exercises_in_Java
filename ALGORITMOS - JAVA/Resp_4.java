package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		String nome;
		int idade, totalDias;
		
		System.out.println("Digite seu nome:");
		nome = scan.next();
		
		System.out.println("Agora, digite sua idade:");
		idade = scan.nextInt();
		totalDias = idade * 365;
		
		System.out.println(nome + ", você já viveu " + totalDias + " dias.");
		
		
		scan.close();
	}
}
