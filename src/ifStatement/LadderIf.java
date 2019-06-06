package ifStatement;

/*
* @author paribartan
*/
public class LadderIf {
   public static void main(String[] args) {   

      int number = 0;
	 
      if (number > 0) {
         System.out.println("Number is positive.");
      }
      else if (number < 0) {
         System.out.println("Number is negative.");
      }
      else {
         System.out.println("Number is 0.");
      } 
   }
}