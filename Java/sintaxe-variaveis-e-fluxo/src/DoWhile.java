import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os números: (OBS: Digite 0 para parar)");
		
		int valorAlto = 0;
		int impar = 0;
		int pares = 0;
		int i = 0;
		float numero;
		
		do {
			numero = teclado.nextFloat();
			
			i++;
			//System.out.println(i);
			
			if (numero != 0) {
				if (numero % 2 == 0) {
					pares++;
				} else {
					impar++;
				}
				
				if (numero > 100) {
					valorAlto++;
				}
			}
											
		} while (numero != 0);
		
		System.out.println("Total de Valores: " + (i - 1));
		System.out.println("Total de pares: " + pares);
		System.out.println("Total de ímpares: " + impar);
		System.out.println("Valores maiores que 100: " + valorAlto);

	}

}
