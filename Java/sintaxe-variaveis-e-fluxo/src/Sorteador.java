import java.util.Scanner;

public class Sorteador {

	public static void main(String[] args) {
		
		double numeroSorteado = Math.round(Math.random() * 10) ;
		// System.out.println("N�mero sorteado: " + numeroSorteado);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o n�mero sorteado? Entre 0 e 10");
		int numeroDigitado = teclado.nextInt();
		// System.out.println("N�mero Digitado: " + numeroDigitado);
		
		if (numeroSorteado == numeroDigitado) {
			System.out.println("Parab�ns! Voc� acertou.");
		} else {
			System.out.println("Errou! O n�mero sorteado foi " + numeroSorteado);
		}
		
	}
}
