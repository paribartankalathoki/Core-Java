package bunniesProblem;

import java.util.*;
/* 
* @author Paribartan
*/
public class Bunnies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bunnies : ");
		int n = sc.nextInt();

		int bunnies = bunnyEars(n);
		System.out.println("The Bunnies = " + bunnies + " ears.");
	}

	static int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		} else {
			return bunnyEars(bunnies - 1) + 2;
		}
	}
}