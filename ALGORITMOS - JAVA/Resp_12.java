package resposta;

import java.util.Locale;
import java.util.Scanner;

public class Resp_12 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		double salario, reajuste, desconto;
		
		System.out.println("Digite o salário do colaborador:");
		salario = scan.nextDouble();
		
		reajuste = salario + (salario * (15.0/100));
		desconto = reajuste - (reajuste * (8.0 / 100));
		
		System.out.println("Salário inicial: R$ " + salario);
		System.out.println("Após o reajuste de 15% seu novo salário é R$ " + reajuste);
		System.out.println("Desconto de 8% seu novo salário é R$ " + desconto);
		
		scan.close();
	}
}
