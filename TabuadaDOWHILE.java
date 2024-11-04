import java.util.Scanner;
public class TabuadaDOWHILE {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, tabuada, contador;
	
		contador = 0;
		
		System.out.print("Entre com o numero que deseja calcular: ");
		numero = leia.nextInt();
		
		do{
			tabuada = numero * contador;
			
			System.out.println(numero + " x " + contador + " = " + tabuada );
			
			contador++;
		}while( contador <= 10);
	}
}

