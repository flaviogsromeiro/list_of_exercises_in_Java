package Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do aluno:");
		student.nome = sc.nextLine();
		System.out.println("Digite as notas trimetrais do " + student.nome + " :");
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		double notaFinal = student.calculo();
		
		if (notaFinal > 60.0) {
			System.out.println("FINAL GRADE: " + student);
			System.out.println("PASS");
		} else {
			System.out.println("FINAL GRADE: " + student);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS.", student.validacao());
		}
		
		sc.close();
	}

}
