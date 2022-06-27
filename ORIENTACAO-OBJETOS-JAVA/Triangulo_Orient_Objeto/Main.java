package Triangulo_Orient_Objeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite as medidas do Triângulo X:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Digite as medidas do Triângulo Y:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("ÁREA TRIÂNGULO X : %.4f .", areaX);
		System.out.printf("ÁREA TRIÂNGULO Y : %.4f .", areaY);
		System.out.println("");

		Math.max(areaX, areaY);

		if (areaX > areaY) {
			System.out.println("Triângulo X com maior área");
		} else {
			System.out.println("Triângulo Y com maior área");
		}

		scan.close();
	}

}
