public class SomaDeUmA100DoWhile {
	
	public static void main (String[] args) {
		int numero, soma;
		
		numero = 1;
		soma = 0;
		
		do{
			soma += numero;
			
			numero++;
		}while(numero <= 100);
		
		System.out.println("A soma de 1 a 100 eh: " + soma);
	}
}

