import java.util.Scanner;
public class TabuadaFORV2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, tabuada;
		
		
		
		System.out.print("Entre com o numero que deseja calcular: ");
		numero = leia.nextInt();
		
		for (int contador = 0 ;contador <= 10; contador++){
			tabuada = numero * contador;
			System.out.println(numero + " x " + contador + " = " + tabuada );
		}
	}
}

