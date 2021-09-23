package elseifstatement;

import java.util.Scanner;                               // Imported Scanner from library.

/**
 * @author diegolucas
 */
public class ElseIfStatement {
    
    public static void main(String[] args) {
        
        char group;                                     // Declare a variable with no value to store group.
        Scanner keyboard = new Scanner(System.in);      // Scanner to collect user input.
        System.out.println("Lab Times");
        System.out.println("Enter your group (A, B or C)");
        group = keyboard.next().charAt(0);              // Saves user input to variable "group".
        
        /* This is an example of else statements with nested "if...else" statements. */
        
        if (group == 'A' || group == 'a') {             // Condition uses || (OR) operator to accept both upper and lower case.
            System.out.println("Your class starts at 1 pm.");
        }
        else if (group == 'B'|| group == 'b') {
            System.out.println("Your class starts at 3 pm.");
        }
        else if (group == 'C'|| group == 'c') {
            System.out.println("Your class starts at 5 pm.");
        }
        else {                                          // If any other character is entered though, the programme will show this message.
            System.out.println("This group does not exist.");
        }
        
    }
    
}
