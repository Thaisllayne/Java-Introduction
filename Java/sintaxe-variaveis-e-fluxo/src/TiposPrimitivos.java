import java.util.Scanner;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Entrada de dados
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.println("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		System.out.format("A nota de %s é %.1f \n", nome, nota);
		
		// Para ler as informações, utiliza:
		//.nextInt(), .nextFloat() ou .nextLine();
		
		
		//Convertendo inteiro em String:
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		
		//Convertendo String em real:
		String valorReal = "54.4";
		float idadeReal = Float.parseFloat(valorReal);
		System.out.printf("%.3f", idadeReal);
	}

}
