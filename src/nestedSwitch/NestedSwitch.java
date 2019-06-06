package nestedSwitch;

import java.util.*;

/* 
* @author Paribartan
*/
public class NestedSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("remember you can enter either: a, b, c or d");
		System.out.print("Enter choice : ");
		char c = sc.next().charAt(0);

		switch(c) {
			case 'a':
				System.out.print("hello from switch case.");
				break;
			case 'b':
				System.out.print("you're trying to access nested switch statement.");
				System.out.print("Enter choice : ");
				char a = sc.next().charAt(0);
				switch(a) {
					case 'c':
					System.out.print("First statement of NestedSwitch statement.");
					break;
					case 'd':
					System.out.print("second statement of NestedSwitch statement.");
					break;
				}
				break;
			case 'c':
				System.out.print("statement after the nested switch statement.");
				break;
			default:
				System.out.print("Invalid choice.please make valid");

		}
	}
}