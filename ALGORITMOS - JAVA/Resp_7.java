package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		int dia, mes, qtdDias;
		
		System.out.println("Digite o dia e o mes:");
		dia = scan.nextInt();
		mes = scan.nextInt();
		
		if ((dia > 0 && dia <= 30) && (mes > 0 && mes <= 12)) {
			qtdDias = ((mes - 1) * 30) + dia;
			System.out.println("Dias percorridos: " + qtdDias + " dias.");
		} else {
			System.out.println("Dia e mês inválidos. Digite novamente.");
			dia = scan.nextInt();
			mes = scan.nextInt();
		}
		
		
		scan.close();
	}
}
