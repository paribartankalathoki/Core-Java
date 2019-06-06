package sumOfPrimeNumber;

/* 
* @author Paribartan
*/
public class SumOfPrimeNumber {
	public static void main(String[] args) {
	boolean isPrime = true; 
	int sum = 0;
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
        		sum += number;
        	}
    	}	
    	System.out.print("The sum of prime number btwn 1-100 : " + sum);
	}
}