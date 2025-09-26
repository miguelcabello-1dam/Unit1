package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Diseña un programa que pida un número al usuario y a continuación lo muestre.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable del numero como entero
		int num;
		
		// Pedimos que se introduzca un numero
		System.out.println("Introduce un numero");
		// Escaneamos el numero y lo metemos en la variable num
		num = sc.nextInt();
		
		// Se devuelve por pantalla el numero introducido
		System.out.println("El numero que has introducido es " + num);
		
		// Cerramos el scanner
		sc.close();
	}

}