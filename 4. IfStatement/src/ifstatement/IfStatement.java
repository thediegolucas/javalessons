package ifstatement;

import java.util.Scanner;                               // Imported Scanner from library.

/**
 * @author diegolucas
 */
public class IfStatement {

    public static void main(String[] args) {        
        /* This programme will ask the user for their age at a rollercoaster. If the person
        ** is younger than 13, the programme will display an extra message. */
        
        int age;                                        // Declare variable with no value to store an age.
        Scanner keyboard = new Scanner(System.in);      // Scanner to collect user input
        
        System.out.println("Welcome to our Rollercoaster! How old are you?");
        age = keyboard.nextInt();                       // Saves user input to variable "age".
        
        /* The "if" statement will check whether the age entered is 13 or less. If so, the extra message
        ** will be displayed. */
        
        if (age < 13) {
            System.out.println("Hello, kid!");
        }
        
        /* If the age entered is more than 13, the programmed will only show this message: */
        
        System.out.println("Enjoy your ride!");
    }
    
}
