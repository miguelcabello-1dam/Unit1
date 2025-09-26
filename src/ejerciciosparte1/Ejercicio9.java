package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables de la edad y mayoria de edad como entero y como booleano
		int edad;
		boolean mayoredad;
		
		// Pedimos que se introduzca la edad
		System.out.println("Introduce tu edad");
		// Escaneamos la edad y lo metemos en la variable edad
		edad = sc.nextInt();
		
		mayoredad = edad >= 18;
		
		// Devolvemos por pantalla si es mayor de edad o no
		System.out.println("¿Es mayor de edad? " + mayoredad);
		
		// Cerramos el scanner
		sc.close();
	}

}
