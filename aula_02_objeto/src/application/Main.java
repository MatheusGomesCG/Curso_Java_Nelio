package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		System.out.println();
		
		System.out.println("Product data: " + product.toString());
		System.out.println();
		
		System.out.print("Enter the number of product to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		
		System.out.println("Updated data: " + product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println();
		
		System.out.printf("Updated data: " + product.toString());
		System.out.println();
		
		sc.close();

	}

}
