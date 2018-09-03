import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int fact = 1;
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number");
		int numb = scn.nextInt();

		while (numb > 0) {
			fact = fact * numb;
			numb--;
		}
		System.out.println(fact);
		////anand kumar
		// phir se add
		// from git repo
		// from repo and ecl
	}
}
