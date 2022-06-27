package Product;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double TotalValueInStock() {
		return preco * quantidade;
	}
	
	public void AddProducts (int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void RemoveProducts (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return    nome 
				+ ", R$ "
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " unidades, TOTAL: R$ "
				+ String.format("%.2f", TotalValueInStock());
	}
}
