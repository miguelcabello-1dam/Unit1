package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado de la conversión.(1€ = 166 ptas).
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos de la variable de las pesetas como entero
		int peseta;
		// Declaracion de la variable de los euros como doublle
		double eur;
		
		// Pedimos que se introduzcan las pesetas
		System.out.println("Introduce un numero de pesetas");
		// Escaneamos las pesetas y lo metemos en la variable peseta
		peseta = sc.nextInt();
		
		// Calculo de pesetas a euros 1€ = 166 pesetas
		eur = (double) peseta / 166;
		
		// Devolvemos por pantalla los euros
		System.out.println(peseta + " pesetas son " + eur + " euros");
		
		// Cerramos el scanner
		sc.close();
	}

}
