package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_17 {

	public static void main(String[] args) {

		// FÓRMULA > (0 °C × 9/5) + 32 = 32 °F

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double celsius, fahrenheit;

		System.out.println("Digite a temperatura em Celsius:");
		celsius = scan.nextDouble();

		fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println(celsius + " °C equivale a " + fahrenheit + " °F .");

		scan.close();
	}
}
