import java.util.Scanner;

public class ContaNParesFOR {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, contador;
		
		numero = -1;
		contador = 0;
		
		for ( ; numero != 0 ; ){
		System.out.print("Entre com um numero: [zero p/ sair] ");
		
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero != 0 ){
			contador++;
		}
	}
	
	System.out.print("\nQuantidade de pares digitados: " + contador);
	}
}

