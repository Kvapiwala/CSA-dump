/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 'true' or 'false' for A");
    boolean a = sc.nextBoolean(); 

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = sc.nextBoolean();
    
    if (!(a || b)) {
      System.out.println("NOT(A OR B) evaluates to True");
    }
    else {
      System.out.println("NOT(A OR B) evaluates to False");
    }
    if (!a && !b) {
      System.out.println("NOT A AND NOT B evaluates to True");
    }
    else {
      System.out.println("NOT A AND NOT B evaluates to False");
    }
    if (!(a && b)) {
      System.out.println("NOT(A AND B) evaluates to True");
    }
    else {
      System.out.println("NOT(A AND B) evaluates to False");
    }
     if (!a || !b) {
      System.out.println("NOT A OR NOT B evaluates to True");
    }
    else {
      System.out.println("NOT A OR NOT B evaluates to False");
    }

    // close Scanner when done
    sc.close();
  }
}
