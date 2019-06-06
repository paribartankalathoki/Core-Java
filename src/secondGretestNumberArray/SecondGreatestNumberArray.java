package secondGretestNumberArray;

/* 
* @author Paribartan
*/
public class SecondGreatestNumberArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int fg = arr[0];
		int sg = arr[0];
		for(int i = 1;i < arr.length; i++) {
			if(fg < arr[i]) {
				sg = fg;
				fg = arr[i];
			} else if (sg < arr[i]) {
				sg = arr[i];
			}
		}

		System.out.print("Greatest number is : " + sg);	
	}
}