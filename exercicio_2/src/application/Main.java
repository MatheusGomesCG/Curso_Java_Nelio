package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle calc;
		
		calc = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		calc.width = sc.nextDouble();
		calc.height = sc.nextDouble();
		
		System.out.println(calc.toString());
		sc.close();

	}

}
