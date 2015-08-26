package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
	int factorial = 1;
	int numero;
		
	Scanner leer = new Scanner(System.in);
	System.out.println("Ingresa un numero para calcular su factorial: ");
	numero = leer.nextInt();
	
	while(numero != 0){
		factorial = factorial * numero;
		numero--;
	}
	
		System.out.println("El factorial es: " + factorial);
	
	}

}
