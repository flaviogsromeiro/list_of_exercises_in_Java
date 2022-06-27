package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int dias = 0;
		int mes = 0;
		int ano = 0;
		int restoAno = 0;

		System.out.println("Digite a quantidade de dias sem incidentes: ");
		dias = scan.nextInt();

		mes = (dias / 30);
		dias = Math.abs((30 * mes) - dias);

		if (mes >= 12) {
			ano = mes / 12;
			restoAno = mes % 12;
			mes = (restoAno * 30) / 30;
		}

		System.out.println("Estamos a " + ano + " anos, " + mes + " mes e " + dias + " dias sem incidentes");

		scan.close();
	}
}
