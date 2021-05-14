import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Criando um triângulo!!");
		System.out.println("Para isso, é necessário informar 3 valores");
		
		System.out.print("Informe o primeiro valor: ");
		int a = teclado.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int b = teclado.nextInt();
		
		System.out.print("Informe o terceiro valor: ");
		int c = teclado.nextInt();
		
		if (a < b+c && b < a+c && c < a+b) {
			System.out.print("É possível criar um triângulo ");
			
			if (a==b && b==c) {
				System.out.println("Equilátero");
			} else if (a!=b && b!=c && a!=c) {
				System.out.println("Escaleno");
			} else {
				System.out.println("Isósceles");
			}
		} else {
			System.out.println("Não formam um triângulo!");
		}
		
		
		
	}
	
}
