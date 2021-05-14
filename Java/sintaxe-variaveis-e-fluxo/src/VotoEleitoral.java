import java.util.Scanner;

public class VotoEleitoral {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");		
		int idade = teclado.nextInt();
		// System.out.println(idade);
		
		if (idade <= 0) {
			System.out.println("Idade inválida");
		} else {
			if (idade < 16) {
				System.out.println("Ainda não pode votar!");
			} else if ((idade >=16 && idade < 18) || (idade > 70)){
				System.out.println("O voto é opcional!");
			} else {
				System.out.println("O voto é obrigatório!");
			}
		}
		
		
		
		
		
	}
}
