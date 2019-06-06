package ifStatement;


/*
* @author paribartan
*/
public class NestedIf {
    public static void main(String[] args) {

        int n1 = 3, n2 = 4, n3 = 5, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Largest number is " + largestNumber);
    }
}