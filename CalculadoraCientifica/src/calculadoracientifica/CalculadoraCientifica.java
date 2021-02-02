package calculadoracientifica;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class CalculadoraCientifica {

	static Scanner teclado, teclado2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Calculadora Científica implementa un programa para realizar calculos
		 * científicos apoyándose en la clase Math
		 * 
		 *
		 * 
		 */

		/**
		 * Método principal de la clase que lanza el programa calculadora
		 * 
		 * @param args argumentos que recibe de la línea de comandos
		 */

		teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			try {
				opcion = menu();
				seleccionarOperacion(opcion);
			} catch (InputMismatchException e) {
				teclado.next();
				opcion = 0;
			}
		} while (opcion == 0);
	}

	/**
	 * Método que imprime un menú y recoge la opción del usuario
	 * 
	 * @return opción escogida por el usuario, cero en caso de error
	 * @throws InputMismatchException si mete el usuario algo que no es un número
	 */
	public static int menu() {
		int opcion;
		System.out.println("Elige la operación a realizar");
		System.out.println("-------------------------------------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Potencias");
		System.out.println("6. Cálculo del resto");
		System.out.println("7. Seno, ");
		System.out.println("8.  coseno y ");
		System.out.println("9. tangente");
		System.out.println("10. Logaritmos");
		System.out.println("-------------------------------------");
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException e) {
			throw e;
		}
		return opcion;
	}

	public static void seleccionarOperacion(int opcion) {
		System.out.println("Inserte 2 números para operar: ");
		teclado2 = new Scanner(System.in);
		double numero1 = teclado.nextDouble();
		double numero2 = teclado.nextDouble();
		switch (opcion) {
		case 1: {
			System.out.println(suma(numero1, numero2));
			break;
		}
		case 2: {
			System.out.println(resta(numero1, numero2));
			break;
		}
		case 3: {
			System.out.println(multiplicacion(numero1, numero2));
			break;
		}
		case 4: {
			System.out.println(division(numero1, numero2));
			break;
		}
		case 5: {
			int exponente = (int) numero2;
			int base = (int) numero1;
			System.out.println(potencia(base, exponente));
			break;
		}
		case 6: {
			System.out.println(resto(numero1, numero2));
			break;
		}
		// A partir de este momento sólo es necesario el primer número para hacer las
		// operaciones, aunque pida los 2 numeros
		case 7: {
			System.out.println(seno(numero1));
			break;
		}
		case 8: {
			System.out.println(coseno(numero1));
			break;
		}
		case 9: {
			System.out.println(tangente(numero1));
			break;
		}
		case 10: {
			System.out.println(logaritmo(numero1));
			break;
		}
		}
	}

	private static double suma(double numero1, double numero2) {
		return numero1 + numero2;
	}

	private static double resta(double numero1, double numero2) {
		return numero1 - numero2;
	}

	private static double multiplicacion(double numero1, double numero2) {
		return numero1 * numero2;
	}

	private static double division(double numero1, double numero2) {
		return numero1 * numero2;
	}

	private static int potencia(int base, int exponente) {
		System.out.println("Para calcular la potencia de un número, introduzca su base");
		base = teclado.nextInt();
		System.out.println("Introduzca ahora el exponente");
		exponente = teclado.nextInt();
		int resultado = (int) Math.pow(base, exponente);
		System.out.println(base + " elevado a  " + exponente + " es igual a " + resultado);
		return resultado;
	}

	private static int resto(double numero1, double numero2) {
		return (int) (numero1 % numero2);
	}

	private static double seno(double numero1) {
		return Math.sin(numero1);
	}

	private static double coseno(double numero1) {
		return Math.cos(numero1);
	}

	private static double tangente(double numero1) {
		return Math.tan(numero1);
	}

	private static double logaritmo(double numero1) {
		return Math.log(numero1);
	}



	}


