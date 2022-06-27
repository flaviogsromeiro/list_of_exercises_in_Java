package Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Digite os dados do Produto:");
		System.out.print("Nome: ");
		product.nome = sc.nextLine();
		System.out.print("Preço: ");
		product.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantidade = sc.nextInt();

		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Digite a quantidades de produtos para ADICIONAR ao estoque: ");
		int quantidade = sc.nextInt();
		product.AddProducts(quantidade);
		
		System.out.println("Atualização: " + product);
		
		System.out.println();
		System.out.print("Digite a quantidade de produtos para REMOVER: ");
		quantidade =sc.nextInt();
		product.RemoveProducts(quantidade);
		
		System.out.println("Atualização: " + product);
		
		
		sc.close();
	}

}
