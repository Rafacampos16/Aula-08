import java.util.Scanner;

public class ContaNParesFORv2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int contador;
		
		
		contador = 0;
		
		for (int numero = -1; numero != 0 ; ){
		System.out.print("Entre com um numero: [zero p/ sair] ");
		
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero != 0 ){
			contador++;
		}
	}
	
	System.out.print("\nQuantidade de pares digitados: " + contador);
	}
}

