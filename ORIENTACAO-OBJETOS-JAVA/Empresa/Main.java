package Empresa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Empresa empresa = new Empresa();
		
		System.out.print("NOME: ");
		empresa.nome = sc.nextLine();
		System.out.print("SALARIO: ");
		empresa.salario = sc.nextDouble();
		System.out.print("IMPOSTO: ");
		empresa.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("EMPRESA: " + empresa);
		System.out.println();
		
		System.out.print("DIGITE A PORCENTAGEM DE REAJUSTE: ");
		double porcentagem = sc.nextDouble();
		empresa.reajuste(porcentagem);
		
		System.out.println("ATUALIZAÇÃO: " + empresa);
		
		sc.close();
		
	}

}
