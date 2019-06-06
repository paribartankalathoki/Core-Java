package sumOfOddNumberBetweenRange;

import java.util.*;
/* 
* @author Paribartan
*/
public class SumOfOddNumberBtwnRange {
	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i+=2) {
			sum += i; 
		}
		System.out.println("Sum of OddNumbers : " + sum);
	}
}