import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		
		int num[] = {3, 5, 1, 8, 4};
		
		// Para ordenar o vetor:
		Arrays.sort(num);
		
		//ForEach:
		for (int valor: num) {
			System.out.println(valor);
		}
		
		// Buscando um valor:
		int pos = Arrays.binarySearch(num, 4);
		System.out.println("Encontrei o valor na posição " + pos);
				
	}
	
}