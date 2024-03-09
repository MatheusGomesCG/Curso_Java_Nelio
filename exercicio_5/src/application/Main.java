package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Quantos números inteiros você vai digitar? ");
			int n = sc.nextInt();

			if (n <= 10 && n > 0) {

				int[] vect = new int[n];

				for (int i = 0; i < vect.length; i++) {
					System.out.print("DIGITE UM NÚMERO: ");
					vect[i] = sc.nextInt();
				}

				System.out.println("NUMEROS NEGATIVOS:");
				for (int i = 0; i < vect.length; i++) {
					if (vect[i] < 0) {
						System.out.printf("%d%n", vect[i]);
					}
				}
				break;

			} else {
				System.out.println("Digite um valor de 1 até 10");
			}
		} while (true);

		sc.close();
	}

}
