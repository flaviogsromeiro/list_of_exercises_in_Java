package Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Triagulo_SemOO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;
		double pX, pY, areaX, areaY;

		System.out.println("Digite as medidas do Triângulo X:");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();

		System.out.println("Digite as medidas do Triângulo Y:");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();

		pX = (xA + xB + xC) / 2;
		pY = (yA + yB + yC) / 2;

		areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

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
