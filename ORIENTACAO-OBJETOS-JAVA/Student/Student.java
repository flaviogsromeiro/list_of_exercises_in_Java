package Student;

public class Student {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	
	public double calculo() {
		return n1 + n2 + n3;
	}
	
	public double validacao() {
		if (calculo() < 60) {
			return 60.0 - calculo();
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		return  String.format("%.2f", calculo());
	}
}
