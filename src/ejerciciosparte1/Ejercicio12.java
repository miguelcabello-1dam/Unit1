package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos, tanto de las peras como de las manzanas). La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables la venta de los kilos de peras y manzanas como enteros y las constantes de los precios por kilos como doubles por los decimales y los beneficios anuales como double
		int ventakilosperas;
		int ventakilosmanzanas;
		final double preciokilopera = 1.95;
		final double preciokilomanzana = 2.35;
		double beneficioanual;
		
		// Pedimos que se introduzcan los kilos de peras y manzanas
		System.out.println("Introduce la cantidad de venta de kilos de pera");
		ventakilosperas = sc.nextInt();
		System.out.println("Introduce la cantidad de venta de kilos de manzana");
		ventakilosmanzanas = sc.nextInt();
		
		beneficioanual = ventakilosperas * preciokilopera + ventakilosmanzanas * preciokilomanzana;
		
		// Devolvemos por pantalla el beneficio anual
		System.out.println("El beneficio anual de las ventas es de: " + beneficioanual + "€");
		
		// Cerramos el scanner
		sc.close();
	}

}
