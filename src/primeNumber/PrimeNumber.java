package primeNumber;

import java.util.*;
/* 
* @author Paribartan
*/
/* 
* @author Paribartan
*/
public class PrimeNumber {
	public static void main(String[] args) {
		boolean isPrime = true; 
    	for (int number = 1; number <= 100; number++) {
        		isPrime = true;
        	if (number == 1) 
        		isPrime = false;
        	for (int divisor = 2; divisor < number && isPrime; divisor++) {
            	if (number % divisor == 0) {
	                isPrime = false;
            	}
        	}
        	if (isPrime) {
        		System.out.print(number+",  ");
        	}
    	}
    }
}
