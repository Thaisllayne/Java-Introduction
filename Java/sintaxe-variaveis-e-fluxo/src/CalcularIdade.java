import java.time.LocalDate;
import java.util.Scanner;

public class CalcularIdade {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o ano de Nascimento:");
		int nascimento = teclado.nextInt();
		
		int ano = LocalDate.now().getYear();
		// System.out.println(ano);
		
		if (nascimento <= 1900 || nascimento >= ano) {
			System.out.println("Ano inválido!");
		} else {
			int idadeAtual = ano - nascimento;
			System.out.println("Você tem " + idadeAtual + " anos");
			
		}
	
	}

}
