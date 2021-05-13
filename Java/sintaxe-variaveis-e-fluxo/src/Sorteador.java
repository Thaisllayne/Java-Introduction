import java.util.Scanner;

public class Sorteador {

	public static void main(String[] args) {
		
		double numeroSorteado = Math.round(Math.random() * 10) ;
		// System.out.println("Número sorteado: " + numeroSorteado);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o número sorteado? Entre 0 e 10");
		int numeroDigitado = teclado.nextInt();
		// System.out.println("Número Digitado: " + numeroDigitado);
		
		if (numeroSorteado == numeroDigitado) {
			System.out.println("Parabéns! Você acertou.");
		} else {
			System.out.println("Errou! O número sorteado foi " + numeroSorteado);
		}
		
	}
}
