import java.util.Scanner;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		float a = teclado.nextFloat();
		
		System.out.print("Digite o valor de B: ");
		float b = teclado.nextFloat();
		
		System.out.print("Digite o valor de C: ");
		float c = teclado.nextFloat();
		
		double delta = (Math.pow(b, 2) - (4*a*c));
		System.out.println("O valor de delta foi: " + delta);
		
		if (delta < 0) {
			System.out.println("Não existem raízes Reais");			
		} else {
			System.out.println("Existem raízes Reais");
		}
		
		
	}

}
