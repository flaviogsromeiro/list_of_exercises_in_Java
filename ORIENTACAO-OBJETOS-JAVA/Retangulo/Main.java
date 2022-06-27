package Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double area, perimetro, diagonal;

		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a ALTURA e LARGURA do retangulo:");
		System.out.print("ALTURA: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("LARGURA: ");
		retangulo.largura = sc.nextDouble();
		
		area = retangulo.area();
		perimetro = retangulo.perimetro();
		diagonal = retangulo.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETRO = %.2f%n", perimetro);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		
		sc.close();
	}

}
