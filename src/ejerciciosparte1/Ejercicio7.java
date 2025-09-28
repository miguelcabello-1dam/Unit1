package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Escribir un programa que le pida al usuario su nombre, dirección y teléfono. Guarda cada dato en variables distintas.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declararion de la variable del nombre como string
		String nombre;
		// Declararion de la variable de la direccion como string
		String direccion;
		// Declararion de la variable del telefono como string
		String telefono;
		
		// Pedimos que se introduzca el nombre
		System.out.println("Introduce tu nombre");
		// Escaneamos el nombre y lo metemos en la variable nombre
		nombre = sc.nextLine();

		// Pedimos que se introduzca la direccion
		System.out.println("Introduce tu direccion");
		// Escaneamos la direccion y lo metemos en la variable direccion
		direccion = sc.nextLine();
		
		// Pedimos que se introduzca el telefono
		System.out.println("Introduce tu telefono");
		// Escaneamos el telefono y lo metemos en la variable telefono
		telefono = sc.nextLine();
		
		// Devolvemos por pantalla exactamente como se nos pide
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Telefono: " + telefono);
		
		// Cerramos el scanner
		sc.close();
	}

}
