package sumOfArray;

/* 
* @author Paribartan
*/
public class SumOfArray {
	public static void main(String[] args) {
		int someArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;

		for (int i : someArray) {
		    sum += i;
		}
		System.out.print("sum : " + sum);
	}
}