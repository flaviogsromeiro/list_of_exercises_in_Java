package Empresa;

public class Empresa {

	public String nome;
	public double salario;
	public double imposto;
	
	public double desconto() {
		return salario - imposto;
	}
	
	public void reajuste(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome
			+ ", "
			+ " R$ "
			+ String.format("%.2f", desconto())
			+ " reais.";
	}
	
}
