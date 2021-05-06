
public class ExercicioCondicional {
	
	public static void main(String[] args) {
		
		double salario = 1000.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua alíquota é de 7.5%");
			System.out.println("Você pode deduzir o valor de até R$ 142");
		} 
		else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode deduzir o valor de até R$ 350");
		} 
		else if (salario >= 3751.0 && salario <= 4664.00) {
			System.out.println("A sua alíquota é de 22.5%");
			System.out.println("Você pode deduzir o valor de até R$ 636");
		} 
		else {
			System.out.println("Salário sem as regras de alíquota");
		}
		
	}
	
	// Existe o switch, que é uma solução para os ifs encadeados.

}
