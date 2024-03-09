package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:%n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			People peo = new People(name, age, height);
			vect[i] = peo;
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getAge();
		}
		
		int avgAge = sum / vect.length;
		
		System.out.printf("A média das idades das pessoas é: %d%n", avgAge);
		sc.close();

	}

}
