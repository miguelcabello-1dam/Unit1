package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. 
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable del nombre como string
		String nombre;
		// Declaracion de la variable de la edad como entero
		int edad;
		
		// Pedimos que se introduzca el nombre
		System.out.println("Introduce tu nombre");
		// Escaneamos el nombre y lo metemos en la variable nombre
		nombre = sc.nextLine();

		// Pedimos que se introduzca la edad
		System.out.println("Introduce tu edad");
		// Escaneamos la edad y lo metemos en la variable edad
		edad = sc.nextInt();
		
		// Devolvemos por pantalla exactamente como se nos pide
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡que mayor eres!");
		
		// Cerramos el scanner
		sc.close();
	}

}
