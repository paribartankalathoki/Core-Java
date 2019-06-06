package datatypeConversion;

/* 
* @author Paribartan
*/
public  class ConvertDatatype {
	public static void main(String[] args) {
		int a = 5;
		String str = Integer.toString(a);
		System.out.print(str);
		String number = "100";
		int result = Integer.parseInt(number);			
		System.out.println("\n" + result);
	}
}