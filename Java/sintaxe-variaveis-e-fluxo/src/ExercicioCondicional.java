
public class ExercicioCondicional {
	
	public static void main(String[] args) {
		
		double salario = 1000.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua al�quota � de 7.5%");
			System.out.println("Voc� pode deduzir o valor de at� R$ 142");
		} 
		else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua al�quota � de 15%");
			System.out.println("Voc� pode deduzir o valor de at� R$ 350");
		} 
		else if (salario >= 3751.0 && salario <= 4664.00) {
			System.out.println("A sua al�quota � de 22.5%");
			System.out.println("Voc� pode deduzir o valor de at� R$ 636");
		} 
		else {
			System.out.println("Sal�rio sem as regras de al�quota");
		}
		
	}
	
	// Existe o switch, que � uma solu��o para os ifs encadeados.

}
