package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) si el número es par.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la variable del numero como entero
		int num;
		// Declaracion de la variable de si es par o impar como booleano
		boolean par;
		
		// Pedimos que se introduzca un numero
		System.out.println("Introduce un numero");
		// Escaneamos el numero y lo metemos en la variable num
		num = sc.nextInt();
		
		// Comparacion si el numero al dividirse entre dos el resto es 0 o no
		par = num % 2 == 0;
		
		// Devolvemos por pantalla si es par o no
		System.out.println("¿Es par? " + par);
		
		// Cerramos el scanner
		sc.close();
	}

}
