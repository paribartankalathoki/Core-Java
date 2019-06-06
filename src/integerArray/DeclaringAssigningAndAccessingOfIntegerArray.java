package integerArray;

/* 
* @author Paribartan
*/
public class DeclaringAssigningAndAccessingOfIntegerArray {
	public static void main(String[] args) {
		int[] arr = new int[3];  	// Declaring of integer array
		arr[0] = 1;			// Assigning value to the array
		arr[1] = 2;			// Assigning value to the array
		arr[2] = 2;			// Assigning value to the array
		try {
	        System.out.println("Array elements are : ");
			for (int i = 0; i < arr.length; i++) {
			 	System.out.println("  " + arr[i]);
			}
	    } catch(ArrayIndexOutOfBoundsException e) {
	        System.out.println("something is wrong!");
	    }
	}
}