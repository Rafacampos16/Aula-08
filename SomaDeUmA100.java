public class SomaDeUmA100 {
	
	public static void main (String[] args) {
		int numero, soma;
		
		numero = 1;
		soma = 0;
		
		while(numero <= 100){
			soma = soma + numero;
			
			numero++;
		}
		
		System.out.println("A soma de 1 a 100 eh: " + soma);
	}
}

