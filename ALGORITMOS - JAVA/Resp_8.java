package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		double nota1, nota2, nota3, mp;
		
		System.out.println("Digite as notas do aluno: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		
		if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10) && (nota3 >= 0 && nota3 <= 10)) {
			mp = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3)) / (1 + 2 + 3);
			System.out.printf("Média Ponderada: %.2f%n", mp);
		} else {
			System.out.println("Notas inválidas.");
		}
		
		scan.close();
	}

}
