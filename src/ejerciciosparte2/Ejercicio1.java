package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable del numero como double
		double num;
		
		// Pedimos que se introduzca un numero con decimales
		System.out.println("Introduce un numero con decimales");
		// Escaneamos el numero y lo metemos en la variable num
		num = sc.nextDouble();
		
		// "Lo redondeamos y le quitamos la parte decimal"
		num = (int) (num + 0.5);
		
		// Se devuelve por pantalla el numero redondeado
		System.out.println("El numero redondeado es " + num);
		
		// Cerramos el scanner
		sc.close();
	}

}