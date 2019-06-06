package sumOfNumberInRange;

/* 
* @author Paribartan
*/
public class SumOfNumberInRange {
	public static void main(String[] args) {
		int sum = 0; 
		
		for (int i = 1; i <= 100; i++) {
			sum += i; 
		}
		System.out.println("The sum of 1-100 : " + sum);
	}
}