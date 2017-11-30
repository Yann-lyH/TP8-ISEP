// CODE RECURSIF
import java.util.Scanner;

public class testRecursiv {

	public static boolean isPalindromeRecursif(String word) {
		if (word.length() <=1) {
			return true;
		}
		if (word.charAt(0) != word.charAt(word.length() - 1)) {
			return false;
		}
		String wordRed = word.substring(1, word.length()  - 1);
		return isPalindromeRecursif(wordRed);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer la phrase souhaitée");
		String a = scan.nextLine();
		String b = a.replaceAll("\\W", "");
		System.out.println(b);
		boolean result = isPalindromeRecursif(b);
		scan.close();
		System.out.println(result);

	}

}
