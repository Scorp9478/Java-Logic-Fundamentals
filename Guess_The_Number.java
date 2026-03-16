import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guess_The_Number {

	public static void main(String[] args) {
		int[] historial = new int[5];
		int posicion = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int numeroSecreto = rd.nextInt(50) + 1;
		int intentos = 5;
		
		System.out.println("Debes adivinar el numero secreto entre 1 y 50 para aprobar, tienes 5 intentos");
		
		while (intentos > 0) {
			System.out.println("Introduce tu numero.");
			try {
			int inputUsuario = sc.nextInt();
			historial[posicion] = inputUsuario;
			posicion++;
			
			if (inputUsuario == numeroSecreto) {
				System.out.println("Has acertado, aprobaste");
				break;
			}
			
				intentos--;
				
			if (intentos > 0) {
				 if (inputUsuario < numeroSecreto) {
					 System.out.println("Caliente (El numero es mas grande). Te quedan " + intentos + " intentos.");
				 } else {
					 System.out.println("Frio (El numero es mas pequeño). Te quedan " + intentos + " intentos");
				 }
			}
		}	
		catch (InputMismatchException e) {
			System.out.println("Has introducido un caracter invalido, prueba otra vez");
			sc.next();
		}
	}		
		if (intentos == 0) {
			System.out.println("No has pasado la prueba, el numero secreto era " + numeroSecreto);
		}
		 System.out.println("Tus números fueron:");
		 for (int i = 0; i < posicion; i++) {
		     System.out.print(historial[i] + " ");
		     }
		sc.close();
	}

}
