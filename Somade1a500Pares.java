public class Somade1a500Pares {
	
	public static void main (String[] args) {
		int soma, numero;
		
		soma = 0;
		
		for(numero = 1; numero <= 500; numero++){
			if (numero % 2 == 0){
				soma += numero;
			}
		}
		System.out.println("A soma de pares de 1 a 500 eh: " + soma);
	}
}

