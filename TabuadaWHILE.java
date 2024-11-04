import java.util.Scanner;
public class TabuadaWHILE {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, tabuada, contador;
	
		contador = 0;
		
		System.out.print("Entre com o numero que deseja calcular: ");
		numero = leia.nextInt();
		
		while( contador <= 10){
			tabuada = numero * contador;
			
			System.out.println(numero + " x " + contador + " = " + tabuada );
			
			contador++;
		}
	}
}

