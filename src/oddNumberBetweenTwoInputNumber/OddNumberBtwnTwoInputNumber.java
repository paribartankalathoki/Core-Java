package oddNumberBetweenTwoInputNumber;

import java.util.*;
/* 
* @author Paribartan
*/
public class OddNumberBtwnTwoInputNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		int n2 = sc.nextInt();

		for (int i=n1; i<=n2; i+=2) {
			System.out.print("  " + i);
		}
	}
}