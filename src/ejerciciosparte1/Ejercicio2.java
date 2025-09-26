package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable de la edad como entero
		int edad;
		
		// Pedimos que se introduzca la edad
		System.out.println("Introduce tu edad");
		// Escaneamos la edad y lo metemos en la variable edad
		edad = sc.nextInt();
		
		// Se devuelve por pantalla la edad del año que viene
		System.out.println("El año que viene tendras " + (edad + 1) + " años");
		
		// Cerramos el scanner
		sc.close();
	}

}