package datatype;

import java.util.*;
/* 
* @author Paribartan
*/
public class Datatype {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Datatype are: \n1.integer\n2.floating point\n3.char\n4.boolean\n");
		System.out.print("enter the integer value : ");
		int a = sc.nextInt();
		System.out.println("\t Datatype = integer = " + a + " \n");
		System.out.print("enter the floating value : ");
		float b = sc.nextFloat();
		System.out.println("\t Datatype = float = " + b + " \n");
		System.out.print("enter the character : ");
		char c = sc.next().charAt(0);
		System.out.println("\t Datatype = char = " + c + " \n");
		System.out.print("enter the boolean : ");
		boolean d = sc.nextBoolean();
		System.out.println("\t Datatype = boolean = " + d + " \n");
		int[] numbers = new int[3];
		System.out.print("Please enter array's values : ");
		   for(int index = 0; index < numbers.length; index++){
			    numbers[index] = sc.nextInt(); 
			    System.out.print("\nDatatype = array = [ " + numbers[index] + " ]\n");
			}
	}
}