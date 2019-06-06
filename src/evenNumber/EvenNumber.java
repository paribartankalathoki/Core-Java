package evenNumber;

/* 
* @author Paribartan
*/
public class EvenNumber {
	public static void main(String[] args) {
		System.out.println(" EvenNumbers Between 1-100 are :");
		for (int i=1; i <=100; i++) {
			if (i%2 == 0)
			System.out.print("  " + i);
		}
	}
}