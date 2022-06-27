package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		//VARIÁVEIS
		
		int qtdPao, qtdBroas;
		double total, poupanca;
		double precoPao = 0.12;
		double precoBroa = 1.50;
		
		
		System.out.print("Quantos pães foram vendidos: ");
		qtdPao = scan.nextInt();
		
		System.out.print("Quantas broas foram vendidas: ");
		qtdBroas = scan.nextInt();
		
		total = (qtdPao * precoPao) + (qtdBroas * precoBroa);
		System.out.println("Total arrecado: " + total);
		
		poupanca = total * (10.0/100);
		System.out.printf("Poupança: %.2f%n", poupanca);
		
		scan.close();
	}
}
