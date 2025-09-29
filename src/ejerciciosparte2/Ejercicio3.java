package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable del primer numero como entero
		int num1;
		// Declaramos la variable del segundo numero como entero
		int num2;
		// Declaramos la variable del la cantidad restante para ser divisible
		int numFaltan;
		
		// Pedimos que se introduzca el primer numero
		System.out.println("Introduce el primer numero");
		// Escaneamos el numero y lo metemos en la variable num1
		num1 = sc.nextInt();
		// Pedimos que se introduzca el segundo numero
		System.out.println("Introduce el primer numero");
		// Escaneamos el numero y lo metemos en la variable num2
		num2 = sc.nextInt();
		
		// Calculamos lo que falta para ser divisible calculando el resto de dividir el primer numero entre el segundo y restandoselo al segundo si el primer numero ya es multiplo del segundo el valor es 0
		numFaltan = num1 % num2 == 0 ? 0 : num2 - num1 % num2;
		
		// Se devuelve por pantalla la cantidad a sumar para que el primer numero sea multiplo del segundo
		System.out.println("Para que el primer numero sea multiplo del segundo hay que sumarle: " + numFaltan);
		
		// Cerramos el scanner
		sc.close();
	}

}