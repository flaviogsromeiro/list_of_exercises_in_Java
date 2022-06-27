package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_18 {

	public static void main(String[] args) {

		// R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int horaNormal, horaExtra, opcao;
		double salario, reajuste;

		System.out.println("Quantos horas o colaborador X trabalhou este mês ? ");
		horaNormal = scan.nextInt();

		System.out.println("O colaborador fez hora extras ?");
		System.out.println("\n(1) SIM \n(2) NÃO");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1: {
			System.out.println("Quantas horas extras o colaborador X trabalhou ?");
			horaExtra = scan.nextInt();

			salario = (horaNormal * 10) + (horaExtra * 15);
			reajuste = (salario * 10.0 / 100) + salario;

			System.out.println("Segue a atualização salarial:");
			System.out.printf("R$ %.2f%n", salario);
			System.out.printf("R$ %.2f%n", reajuste);

			break;
		}
		case 2: {
			salario = (horaNormal * 10);
			reajuste = (salario * 10.0 / 100) + salario;

			System.out.println("Segue a atualização salarial:");
			System.out.printf("R$ %.2f%n", salario);
			System.out.printf("R$ %.2f%n", reajuste);

			break;
		}
		default:
			System.out.println("OPÇÃO INVÁLIDA. PROGRAMA ENCERRADO!");
		}

		scan.close();
	}

}
