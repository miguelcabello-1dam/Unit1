package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Escribe un programa en el que declares una constante IVA de valor igual a 21. A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaracion de la constante del iva como entero
		final int iva = 21;
		// Declaracion de la variable del precio como double
		double precio;
		// Declaracion de la variable del precio total como double
		double precioTotal;
		
		// Preguntamos el precio
		System.out.println("Introduce el precio");
		// Se guarda en la variable precio
		precio = sc.nextDouble();
		
		// Calculo del precio total haciendo una regla de tres con el precio y el iva y añadiendoselo al precio base
		precioTotal = iva * precio / 100 + precio;
		
		// Devolvemos por pantalla el precio total
		System.out.println("El precio total incluyendo el iva es de: " + precioTotal);
		
		// Cerramos el scanner
		sc.close();
	}

}
