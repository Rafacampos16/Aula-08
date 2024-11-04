public class Somade1a500ParesWHILE {
	
	public static void main (String[] args) {
		int soma, numero;
		
		soma = 0;
		numero = 1;
		
		while(numero <= 500 ){
			if (numero % 2 == 0){
				soma += numero;
			}
			numero++;
		}
		System.out.println("A soma de pares de 1 a 500 eh: " + soma);
	}
}

