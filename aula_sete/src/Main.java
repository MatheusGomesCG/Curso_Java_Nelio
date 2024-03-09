import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int botao = 0;
		
			do {
				System.out.println("1 - CADASTRO");
				System.out.println("2 - LOGIN");
				System.out.println("3 - SAIR");
				System.out.print("DIGITE UMA DAS OPÇÕES: ");
				
				botao = sc.nextInt();
				
			} while(botao != 3);
			
		sc.close();

	}

}
