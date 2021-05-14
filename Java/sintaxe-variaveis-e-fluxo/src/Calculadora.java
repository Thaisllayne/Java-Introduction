import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		
		float numero = teclado.nextFloat();
		// System.out.println(numero);
		
		float divisao = numero % 2;		
		System.out.println("Resto da divisão por 2: " + divisao);
		
		System.out.println("Elevado ao cubo: " + Math.pow(numero, 3));
		
		System.out.printf("Raiz Quadrada: %.2f \n", Math.sqrt(numero));
		
		System.out.printf("Raiz Cúbica: %.2f \n", Math.cbrt(numero));
		
		System.out.println("Valor absoluto " + Math.abs(numero));
		
		
	}

}
