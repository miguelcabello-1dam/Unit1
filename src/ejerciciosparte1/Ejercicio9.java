package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable de la edad como entero
		int edad;
		// Declaracion de la variable de mayor de edad o no como booleano
		boolean mayorEdad;
		
		// Pedimos que se introduzca la edad
		System.out.println("Introduce tu edad");
		// Escaneamos la edad y lo metemos en la variable edad
		edad = sc.nextInt();
		
		// Declaramos si es mayor de edad comparando
		mayorEdad = edad >= 18;
		
		// Devolvemos por pantalla si es mayor de edad o no
		System.out.println("¿Es mayor de edad? " + mayorEdad);
		
		// Cerramos el scanner
		sc.close();
	}

}
