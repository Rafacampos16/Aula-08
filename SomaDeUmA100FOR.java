public class SomaDeUmA100FOR {
	
	public static void main (String[] args) {
		int numero, soma;

		soma = 0;
		
		for(numero = 1; numero <= 100; ){
			
			soma += numero++;
		};
		
		System.out.println("A soma de 1 a 100 eh: " + soma);
	}
}

