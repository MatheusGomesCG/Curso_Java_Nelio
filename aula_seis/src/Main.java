import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		//                 condicao          true          false
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O valor do desconto gerado foi R$%.2f%n", desconto);
		
		sc.close();

	}

}
