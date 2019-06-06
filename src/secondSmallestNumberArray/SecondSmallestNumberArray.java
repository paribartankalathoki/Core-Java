package secondSmallestNumberArray;

/* 
* @author Paribartan
*/
public class SecondSmallestNumberArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int fs = arr[0];
		int ss = arr[0];
		for(int i = 1;i < arr.length; i++) {
			if(arr[i]==fs) {
		          ss=fs;
		    } else if(fs > arr[i]) {
				ss = fs;
				fs = arr[i];
			} else if (ss > arr[i]) {
				ss = arr[i];
			}
		}

		System.out.print("second smallest number is : " + ss);	
	}
}