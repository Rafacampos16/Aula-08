import java.util.Scanner;
public class SomaMedia15ValoresWHILE {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma, contador, total;
		double media;
		
		contador = 0;
		soma = 0;
		total = 15;
		
		while (contador < total){
			contador++;
			System.out.print("Entre com o numero: " + contador + ": ");
			numero = leia.nextInt();
		
			soma += numero;
			
		} 
		
		media = (double) soma / total;
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMedia: %.1f" , media);
	}
}

