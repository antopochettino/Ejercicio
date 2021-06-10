//Clase con mayuscula siempre. 
//Tendría que primero decir que exede el peso y no preguntar la zona, habría que cambiar
//Usar constantes en vez de los números directamente en el codigo 
//Si se pone un codigo invalido tmb mostraria el costo es y no debería. 

package ejercicio.paquetes;

import java.util.Scanner;

public class Ejercicio214 {

	private static final int PRECIO_AN = 11;
	private static final int PRECIO_AC = 10;
	private static final int PRECIO_AS = 12;
	private static final int PRECIO_E = 24;
	private static final int PRECIO_A = 27;
	private static final int PESO_MAXIMO = 5000;
	private static final int ZONA_1 = 1;
	private static final int ZONA_2 = 2;
	private static final int ZONA_3 = 3;
	private static final int ZONA_4 = 4;
	private static final int ZONA_5 = 5;

	public static void main(String[] args) {
		int pesoDelPaquete, zonaDelPaquete, costo;
		costo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el peso del paquete en gramos:");
		pesoDelPaquete = sc.nextInt();
		if (pesoDelPaquete < PESO_MAXIMO) {
			System.out.println("Ingrese el codigo de la zona a la que desea enviar el paquete:");
			System.out.println("1 - America del Norte");
			System.out.println("2 - America Central");
			System.out.println("3 - America del Sur");
			System.out.println("4 - Europa");
			System.out.println("5 - Asia");
			zonaDelPaquete = sc.nextInt();
			switch (zonaDelPaquete) {
			case ZONA_1:
				costo = PRECIO_AN * pesoDelPaquete;
				System.out.println("El costo del envio es " + costo);
				break;
			case ZONA_2:
				costo = PRECIO_AC * pesoDelPaquete;
				System.out.println("El costo del envio es " + costo);
				break;
			case ZONA_3:
				costo = PRECIO_AS * pesoDelPaquete;
				System.out.println("El costo del envio es " + costo);
				break;
			case ZONA_4:
				costo = PRECIO_E * pesoDelPaquete;
				System.out.println("El costo del envio es " + costo);
				break;
			case ZONA_5:
				costo = PRECIO_A * pesoDelPaquete;
				System.out.println("El costo del envio es " + costo);
				break;
			default:
				System.out.println("Código de zona invalido");
			}
		} else {
			System.out.println("El paquete no se puede transportar, exede el peso");
		}
	}
}