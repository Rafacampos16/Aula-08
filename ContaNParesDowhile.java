import java.util.Scanner;

public class ContaNParesDowhile {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, contador;
		
		contador = 0;
		
		do{
		System.out.print("Entre com um numero: [zero p/ sair] ");
		
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero != 0 ){
			contador++;
		}
	}while (numero != 0);
	
	System.out.print("\nQuantidade de pares digitados: " + contador);
	}
}

