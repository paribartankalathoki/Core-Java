package gretestNumberOfArray;

/* 
* @author Paribartan
*/
public class GreatestNumberOfArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 1;i < arr.length; i++) {
			if(arr[0] < arr[i])
           	arr[0] = arr[i];
		}
		System.out.print("Greatest number is : " + arr[0]);
	}
}