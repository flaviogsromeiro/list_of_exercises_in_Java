package Retangulo;

public class Retangulo {

	public double altura; 
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return (altura + largura) * 2.0;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
}
