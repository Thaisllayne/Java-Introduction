import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Criando um tri�ngulo!!");
		System.out.println("Para isso, � necess�rio informar 3 valores");
		
		System.out.print("Informe o primeiro valor: ");
		int a = teclado.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int b = teclado.nextInt();
		
		System.out.print("Informe o terceiro valor: ");
		int c = teclado.nextInt();
		
		if (a < b+c && b < a+c && c < a+b) {
			System.out.print("� poss�vel criar um tri�ngulo ");
			
			if (a==b && b==c) {
				System.out.println("Equil�tero");
			} else if (a!=b && b!=c && a!=c) {
				System.out.println("Escaleno");
			} else {
				System.out.println("Is�sceles");
			}
		} else {
			System.out.println("N�o formam um tri�ngulo!");
		}
		
		
		
	}
	
}
