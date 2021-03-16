package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	/** 
	 * @author jesgo
	 */

	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * M�todo que genera el menu interactivo que el usuario utilizar para hacer operaciones en su cuenta bancaria
		 */
		
		Ccuenta cuenta1;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new Ccuenta("Juan L�pez", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MEN� DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("�Cu�nto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("�Cu�nto desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecuci�n");
				} else {
					System.err.println("Opci�n err�nea");
				}

			} catch (IOException ex) {
				Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			}
		} while (opcion != 3);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es: " + saldoActual);
	}
	
	/**
	 * M�todo que organiza el segundo paso a dar a la hora de interactuar con el men�
	 * @param cuenta1
	 * @param cantidad
	 * @param opcion
	 */

	public static void operativa_cuenta(Ccuenta cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.print("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.print("Fallo al ingresar");
			}
		}
	}

		
	}


