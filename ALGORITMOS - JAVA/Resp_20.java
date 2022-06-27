package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double blusas, novelos, media;

		System.out.println("Quantas camisetas foram fabricadas este mês ?");
		blusas = scan.nextDouble();

		System.out.println("Quantas novelos foram usadas este mês ?");
		novelos = scan.nextDouble();

		media = novelos / blusas;

		System.out.printf("A média de novelos usados é %.1f por blusa.", media);

		scan.close();

	}
}
