package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee developer;
		
		developer = new Employee();
		
		System.out.print("NAME: ");
		developer.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		developer.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		developer.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + developer.toString());
		System.out.println();
		
		System.out.print("Wich percentage to increase salary? ");
		developer.increaseSalary(sc.nextDouble());
		System.out.println();
		
		System.out.println("Update data: " + developer.toString());
		
		sc.close();
	}

}
