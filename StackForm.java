import java.util.Scanner;

/**
* This class uses the MrCoxallStack.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-05-28
*/
public class StackForm {
  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    MrCoxallStack astack = new MrCoxallStack();
    
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int anumber = input.nextInt();
    
    astack.push(anumber);
    System.out.print("\nPushed " + anumber + " to Stack.");
    astack.showStack();
    int pop = astack.pop();
    System.out.print("\nPopped " + pop + " from Stack.");
    astack.showStack();
  }
}