package ifelsestatement;

import java.util.Scanner;                               // Imported Scanner from library.

/**
 * @author diegolucas
 */
public class IfElseStatement {

    public static void main(String[] args) {
        /* This programme will check whether the user passed or not an exam. */
        
        int mark;                                       // Declare a variable with no value to store a mark.
        Scanner keyboard = new Scanner(System.in);      // Scanner to collect user input.
        
        System.out.println("What exam mark did you get? (0-100)");
        mark = keyboard.nextInt();                      // Saves the user input to the variable "mark".
        
        /* The "if...else" statement will check for the answer and dislay one of these messages. */
        
        if (mark >= 60) {                               // If the user scored 60 or more, they'll have passed.
            System.out.println("Congratulations, you passed!");
        }
        
        else {                                          // If the used scored less than 60, they'll have failed.
            System.out.println("I'm sorry, but you failed.");
        }
        
        /* This message will always be displayed at the end. */
        
        System.out.println("Good luck with the other exams.");
        
        /* The only limitation with this is that if the user enters 120 or a negative number as a mark,
        the programme will accept it as valid for either of the conditions. */
        
        /* *********************************************************************************************************** */
        
        /* "If...else" statements with operators && (AND), || (OR) and ! (NOT).
        ** It's possible to add more than one condition using operators. */
        
        int temperature;                                // Declare a variable with no value to store a temperature.
        Scanner keyboard2 = new Scanner(System.in);     // Scanner to collect user input.
        
        System.out.println("What's the temperature?");
        temperature = keyboard2.nextInt();               // Saves the user input to the variable "temperature".
        
        /* The "if...else" statement will check for the answer and dislay one of these messages. */
        
        if (temperature >= 5 && temperature <= 12) {    // If the temperature is greater or equal to 5 AND less or equal to 12, it'll be safe.
            System.out.println("It's safe!");
        }
        
        else {                                          // If the used scored less than 60, they'll have failed.
            System.out.println("DANGER!");
        }
        
    }
    
}
