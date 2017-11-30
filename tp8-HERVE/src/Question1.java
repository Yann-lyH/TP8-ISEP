// CODE ITERATIF
import java.util.Scanner;
public class Question1 {
	public static boolean isPalindromeIteratif(String word) {
		String wordInv = "";
		String [] S1 = word.split("");
		String [] S2 = new String [S1.length];
		for (int i = 0; i<S1.length;i++) {
			S2[S1.length - (i+1)] = S1[i];
		}
		for (int i = 0; i<S2.length;i++) {
			wordInv = wordInv + S2[i];
		}
		if (word.equals(wordInv)) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer la phrase souhaitée");
		String a = scan.nextLine();
		String b = a.replaceAll("\\W","");
		System.out.println(b);
		isPalindromeIteratif(b);
		scan.close();

	}

}
