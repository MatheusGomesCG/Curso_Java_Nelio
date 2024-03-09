package util;

public class CurrencyConverter {
	
	public static double dolar(double money, double tax) {
		return (money * tax) * 1.06;
	}
}
