package resposta;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Resp_24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		String nome, sexo, estadoCivil = "";
		int dia, mes, ano, tempoAno;
		int anoAtual = LocalDate.now().getYear();
		char sexo2 = 0;

		System.out.print("Digite seu nome: ");
		nome = scan.next();

		System.out.print("Digite seu sexo: ");
		sexo = scan.next();

		if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Feminino")) {
			sexo2 = sexo.charAt(0);

			System.out.print("Digite seu estado civil: ");
			estadoCivil = scan.next().toUpperCase();

		} else {
			System.out.println("Valor inválido.");

		}

		if (sexo2 == ('F') && estadoCivil.equalsIgnoreCase("CASADA")) {
			System.out.println("Digite a data de casamento.");
			System.out.print("DIA: ");
			dia = scan.nextInt();
			if (dia <= 30) {
				System.out.print("MÊS: ");
				mes = scan.nextInt();

				if (mes <= 12) {

					System.out.print("ANO: ");
					ano = scan.nextInt();
					if (ano <= anoAtual) {

						tempoAno = anoAtual - ano;

						System.out.println("TEMPO DE CASADO(A): " + tempoAno + " anos.");

					}
				}
			}

		} else {
			System.out.println("VALOR INVÁLIDO.");
		}

		scan.close();
	}

}
