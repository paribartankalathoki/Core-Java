package averageOfArrayElement;

/* 
* @author Paribartan
*/
public class AverageOfArrayElement {
	public static void main(String[] args) {
		double average, sum = 0;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (double i : arr) {
		    sum += i;
		}
		average = sum/arr.length;

		System.out.print("Average : " + average);
	}
}