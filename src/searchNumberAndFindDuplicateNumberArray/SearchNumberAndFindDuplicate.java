package searchNumberAndFindDuplicateNumberArray;

import java.util.Scanner;

/**
 * @author Paribartan
 *
 */
public class SearchNumberAndFindDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number do you want?");
		int n = sc.nextInt();
		int[] arrs = new int[n];
		System.out.println("Enter " + n + " array element: ");
		for (int i = 0; i < n; i++) {
			arrs[i] = sc.nextInt();
		}
		boolean found = false;
//		System.out.println("Enter number to search element: ");
//		int search = sc.nextInt();
		int count = 0;
		int[] duplicate = new int[arrs.length];
		for (int i = 0; i < arrs.length; i++) {
			for (int j = i+1; j < arrs.length; j++) {
				if (arrs[i] == arrs[j]) {
					duplicate[i] = arrs[j];
					count ++;
					System.out.println("Duplicate number: " + duplicate[i]);
				}
			}
			System.out.println(count);
		}
//		System.out.println(count);
//		for (int i = 0; i < duplicate.length; i++) {
//			System.out.println("Duplicate number: " + duplicate[i]);
//		}
//		if (found) {
//			System.out.println("Duplicate numbers are: " + search);
//		} else {
//			System.out.println("Number can't find in array list.");
//		}
		
		sc.close();
	}

}
