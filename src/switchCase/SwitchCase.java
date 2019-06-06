package switchCase;

import java.util.*;
/* 
* @author Paribartan
*/
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter choice : ");
		char c = sc.next().charAt(0);

		switch(c) {
			case 'a':
				System.out.print("hello from switch case.");
				break;
			case 'b':
				System.out.print("you're on switch statement.");
				break;
			case 'c':
				System.out.print("statement of switch statement.");
				break;
			default:
				System.out.print("Invalid choice.please make valid");

		}
	}
}