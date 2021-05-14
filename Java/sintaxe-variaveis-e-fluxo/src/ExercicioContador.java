import java.util.Scanner;

public class ExercicioContador {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Contador");
		
		System.out.print("Digite o número inicial: ");
		int inicio = teclado.nextInt();
		
		System.out.print("Digite o número final: ");
		int fim = teclado.nextInt();
		
		System.out.print("Digite a quantidade de passos: ");
		int passo = teclado.nextInt();
		
		if (inicio != 0 && fim != 0 && passo !=0 && passo <= fim) {
			
			for (int i = inicio; i <= fim; i += passo) {
				System.out.println(i);
			}			
			
		} else {
			System.out.println("Não é possível fazer a contagem");
		}
		
	}

}
