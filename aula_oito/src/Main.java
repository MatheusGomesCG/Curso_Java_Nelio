
public class Main {

	public static void main(String[] args) {
		
		/*Formatar: toLowerCase(), toUpperCase(), trim()
		 * Recortar: substring(inicio), substring(inicio, fim)
		 * Substituir: Replace(char, char), Replace(string, string)
		 * Buscar: IndexOf, LastIndexOf
		 * str.Split("")
		 */
		
		String original = "  abcde FGHIJ ABC abc DEFG        ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(4);
		String s05 = original.substring(4, 10);
		String s06 = original.replace('a', 'm');
		String s07 = original.replace("cde", "ijh");
		int s08 = original.indexOf("F");
		int s09 = original.lastIndexOf("bc");
		String[] s10 = original.split(" ");
		
		System.out.println("String Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("substring: 2-" + s05 + "-");
		System.out.println("replace: -" + s06 + "-");
		System.out.println("replace: string -" + s07 + "-");
		System.out.println("indexOf: -" + s08 + "-");
		System.out.println("lastIndexOf: -" + s09 + "-");
		System.out.println("s10[4]: -" + s10[4] + "-");
	}

}
