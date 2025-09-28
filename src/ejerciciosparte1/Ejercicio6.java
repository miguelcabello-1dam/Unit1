package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Escribir un programa que le pida dos números al usuario. A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números. Debe mostrarse el resultado de cada operación en una línea distinta.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables del primer numero como double
		double num1;
		// Declaramos las variables del segundo numero como double
		double num2;
		
		// Pedimos que se introduzca el primer numero
		System.out.println("Introduce el primer numero");
		// Escaneamos el primer numero y lo metemos en la variable num1
		num1 = sc.nextDouble();

		// Pedimos que se introduzca el segundo numero
		System.out.println("Introduce el segundo numero");
		// Escaneamos el segundo numero y lo metemos en la variable num2
		num2 = sc.nextDouble();
		
		// Suma de ambos numeros
		System.out.println("La suma de estos dos numeros es " + (num1 + num2));
		// Resta de ambos numeros
		System.out.println("La resta de estos dos numeros es " + (num1 - num2));
		// Multiplicacion de ambos numeros
		System.out.println("La multiplicacion de estos dos numeros es " + (num1 * num2));
		// Division de ambos numeros
		System.out.println("La division de estos dos numeros es " + (num1 / num2));
		
		// Cerramos el scanner
		sc.close();
	}

}