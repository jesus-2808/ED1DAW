package tabla;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		
		//definimos la entrada con Scanner
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		//iniciamos el bucle para que repita indefinidamente el siguiente bloque de c�digos
		while (true) {
		System.out.print("Inserte un n�mero por teclado: ");
		// Para darle a n un valor de n�mero entero que queramos por teclado
		int n = sc.nextInt();
		            // Realizamos un bucle que se encarga de hacer el c�lculo e imprimir la tabla
		for (int i = 1; i < 11; i++) {
		int r = n * i;
		System.out.println(n + " x " + i + " = " + r);
		}
		System.out.print("�Desea introducir otro n�mero? (inserte 'no' si quiere acabar el programa) ");
		// Se va a leer ahora la respuesta introducida por el usuario.
		String a = sc2.nextLine();
		// Si la respuesta es no, rompemos el bucle infinito.
		if (a.equals("no")) {
		break;
		}
		}
		// Aqu� se cierran los 2 scanner
		sc.close();
		sc2.close();
		}
		
	}


