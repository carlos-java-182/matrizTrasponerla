package matrices;

import java.util.Scanner;

public class Trasponerla {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int matriz[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digita el número de la posición: [" + i + "]" + "[" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("\n");

		}

		// Transponiendo la matriz

		int aux;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j<i; j++) {
				aux= matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i]=aux;
				
				System.out.println("["+i+"]["+j+"]");
			}
		}
		
		System.out.print("La matriz transpuesta es: \n");
		
		for(int i=0; i <3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matriz[i][j]+ "  ");
				
			}
			System.out.print("\n");
		}

	}

}
