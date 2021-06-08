package ejercicioPaquetes;

import java.util.Scanner;

public class ejercicio214 {

	public static void main(String[] args) {
		int pesoDelPaquete, zonaDelPaquete, costo;
		costo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el peso del paquete en gramos:");
		pesoDelPaquete = sc.nextInt();
		System.out.println("Ingrese el codigo de la zona a la que desea enviar el paquete:");
		System.out.println("1 - America del Norte");
		System.out.println("2 - America Central");
		System.out.println("3 - America del Sur");
		System.out.println("4 - Europa");
		System.out.println("5 - Asia");
		zonaDelPaquete = sc.nextInt();
		if (pesoDelPaquete < 5000) {
			switch (zonaDelPaquete) {
			case 1:
				costo = 11 * pesoDelPaquete;
				break;
			case 2:
				costo = 10 * pesoDelPaquete;
				break;
			case 3:
				costo = 12 * pesoDelPaquete;
				break;
			case 4:
				costo = 24 * pesoDelPaquete;
				break;
			case 5:
				costo = 27 * pesoDelPaquete;
				break;
			default:
				System.out.println("Código de zona invalido");
			}
			System.out.println("El costo del envio es " + costo);
		} else {
			System.out.println("El paquete no se puede transportar, exede el peso");
		}
	}
}