public class Somade1a500ParesDOWHILE {
	
	public static void main (String[] args) {
		int soma, numero;
		
		soma = 0;
		numero = 1;
		
		do{
			if (numero % 2 == 0){
				soma += numero;
			}
			numero++;
		}while(numero <= 500 );
		System.out.println("A soma de pares de 1 a 500 eh: " + soma);
	}
}

