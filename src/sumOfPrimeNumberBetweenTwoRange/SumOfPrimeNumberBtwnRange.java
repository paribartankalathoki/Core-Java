package sumOfPrimeNumberBetweenTwoRange;

import java.util.*;
/* 
* @author Paribartan
*/
public class SumOfPrimeNumberBtwnRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		int n2 = sc.nextInt();
		boolean isPrime = true; 
		int sum = 0;
    	for (int number = n1; number <= n2; number++) {
        		isPrime = true;
        	if (number == 1) 
        		isPrime = false;
        	for (int divisor = 2; divisor < number && isPrime; divisor++) {
            	if (number % divisor == 0) {
	                isPrime = false;
            	}
        	}
        	if (isPrime) {
        		sum += number;
        	}
    	}	
    	System.out.print("The sum of prime number : " + sum);
	}
}