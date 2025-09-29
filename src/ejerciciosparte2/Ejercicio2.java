package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable del numero como double
		int num;
		
		// Pedimos que se introduzca un numero
		System.out.println("Introduce un numero");
		// Escaneamos el numero y lo metemos en la variable num
		num = sc.nextInt();
		
		// Se obtiene el resto de dividir entre 7 el numero y se le resta al numero para obtener lo que le falta para ser multiplo si el numero ya es multiplo el valor es 0
		num = num % 7 == 0 ? 0 : 7 - num % 7;
		
		// Se devuelve por pantalla la cantidad a sumar para que sea multiplo de 7
		System.out.println("Para que sea multiplo de 7 hay que sumarle: " + num);
		
		// Cerramos el scanner
		sc.close();
	}

}