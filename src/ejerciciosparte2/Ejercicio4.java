package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Dado el siguiente polinomio de segundo grado: y=ax2+bx+c. Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable de a como entero
		int numA;
		// Declaramos la variable de b como entero
		int numB;
		// Declaramos la variable de c como entero
		int numC;
		// Declaramos la variable de x como entero
		int numX;
		// Declaramos la variable de y como entero
		int numY;
		
		// Pedimos que se introduzca el primer numero
		System.out.println("Introduce el valor de a");
		// Escaneamos el numero y lo metemos en la variable numA
		numA = sc.nextInt();
		// Pedimos que se introduzca el segundo numero
		System.out.println("Introduce el valor de b");
		// Escaneamos el numero y lo metemos en la variable numB
		numB = sc.nextInt();
		// Pedimos que se introduzca el tercer numero
		System.out.println("Introduce el valor de c");
		// Escaneamos el numero y lo metemos en la variable numC
		numC = sc.nextInt();
		// Pedimos que se introduzca el tercer numero
		System.out.println("Introduce el valor de x");
		// Escaneamos el numero y lo metemos en la variable numX
		numX = sc.nextInt();
		
		// Sustituimos en la formula las variables de nuestros valores: y=ax2+bx+c
		numY = numA * numX ^ 2 + numB * numX + numC;
		
		// Se devuelve por pantalla el resultado de la ecuacion
		System.out.println("y = " + numY);
		
		// Cerramos el scanner
		sc.close();
	}

}