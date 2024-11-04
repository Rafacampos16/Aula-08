import java.util.Scanner;
public class SomaMedia15ValoresDOWHILE {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma, contador, total;
		double media;
		
		contador = 0;
		soma = 0;
		total = 15;
		
		do{
			contador++;
			System.out.print("Entre com o numero: " + contador + ": ");
			numero = leia.nextInt();
		
			soma += numero;
			
		} while (contador < total);
		
		media = (double) soma / total;
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMedia: %.1f" , media);
	}
}

