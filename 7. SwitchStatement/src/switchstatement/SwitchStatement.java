package switchstatement;

import java.util.Scanner;                                       // Imported Scanner from library.

/**
 * @author diegolucas
 */
public class SwitchStatement {

    public static void main(String[] args) {
        /* Using a switch instead of "if...else" makes the code neater.
        ** The following code is the same as the "else if" example. */
        
        char group;                                             // Declare a variable with no value to store group.
        Scanner keyboard = new Scanner(System.in);              // Scanner to collect user input.
        System.out.println("Lab Times");
        System.out.println("Enter your group (A, B or C)");
        group = keyboard.next().charAt(0);                      // Saves user input to variable "group"
        
        /* Initiate the Switch */
        
        switch (group) {        // Use the variable name we want to check (group).
            case 'A', 'a': System.out.println("Your class starts as 1 pm.");    // "case" precedes the possible value of the variable we want to check, in this case, 'A', 'a', 'B', 'b' or 'C', 'c'.
                break;          // The "break" command forces the programme to skip the rest of the switch if the condition is true.
            case 'B', 'b': System.out.println("Your class starts as 3 pm.");
                break;
            case 'C', 'c': System.out.println("Your class starts as 5 pm.");    // Note that the letters are enclosed by 'single quotes', because they are variables for "char".
                break;
            default: System.out.println("This group does not exist.");          // This acts as "else". If none of the conditions above are true, this line is executed. 
        }
        
        /* *********************************************************************************************************** */
        
        /* Use of switch without the "break" command to keep the programme . */
        
        int security;
        // Scanner keyboard = new Scanner(System.in);       --> Scanner was already declared on the first example.
        System.out.println("***Secret Agents***");
        System.out.println("Enter security level (1, 2 or 3)");
        security = keyboard.nextInt();
        
        /* Switch without the "break" commands will check security level. If user types 1, he will have access to everything;
        ** If user types 2, access to info is limited to cases 2 and 3; Finally, if user types 3, they'll only access the info on case 3. */
        
        switch(security) {
            case 1: System.out.println("The code to access the safe is 007.");          // Highest level.
            case 2: System.out.println("Jim Kitt is really a double agent.");
            case 3: System.out.println("Martinis in the hotel bar may be poisoned.");   // Lowest level.
                break;      // Add a break in the last one so the "default" message is not displayed if the user types 1, 2 or 3.
            default: System.out.println("No such security level.");     // If user types any other whole numbers, this message is displayed.
        }
        
        /* The programme crashes if user enters a letter, real number or symbol, because "int" only take whole numbers.
        ** Note that the numbers in "case" DO NOT take single quotes as it happens with characters. */
    }
    
}
