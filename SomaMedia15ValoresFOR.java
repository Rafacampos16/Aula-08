import java.util.Scanner;
public class SomaMedia15ValoresFOR {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma, contador, total;
		double media;
		
		soma = 0;
		total = 15;
		
		for (contador = 1; contador <= total; contador++){
			
			System.out.print("Entre com o numero: " + contador + ": ");
			numero = leia.nextInt();
		
			soma += numero;
			
		} 
		
		media = (double) soma / total;
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMedia: %.1f" , media);
	}
}

