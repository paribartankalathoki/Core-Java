package numberBetweenTwoInputNumber;

import java.util.*;
/* 
* @author Paribartan
*/
public class NumberBetweenTwoInputNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2 ; i++) {
			System.out.println(i);
		}
	}
}