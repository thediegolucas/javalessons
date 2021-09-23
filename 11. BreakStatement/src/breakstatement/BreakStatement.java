package breakstatement;

import java.util.Scanner;                               // Imported Scanner from the library.

/**
 * @author diegolucas
 */
public class BreakStatement {

    public static void main(String[] args) {
        /* the "break" statement allows the "switch" to terminate without processing the remaining cases.
        ** The "break" statement can also be used with Java’s loops to terminate a loop before it reaches its natural end. */
        
        // This programme demonstrates the use of "break" inside a "for" loop.
        // The user has to guess the secret number in 3 guesses.
        Scanner keyboard = new Scanner (System.in);     // Scanner to get user input.
        final int SECRET = 27;                          // Secret number. "final" is a constant, which means the variable cannot be changed.
        int number;                                     // Declare a variable with no value for a number.
        boolean guess = false;                          // Boolean set to false, because the user didn't get the correct number yet.
        
        System.out.println("You have 3 goes to guess the secret number.");
        System.out.println("HINT: It is a number less than 50!");
        System.out.println();

        for (int i= 1; i <= 3; i++) {                   // "For" loop is set to repeat 3 times.
        
            System.out.print("Enter guess: ");
            number = keyboard.nextInt();                // Saves user input to variable "number".

            if (number == SECRET) {     // Check if number was guessed correctly.
            guess = true;               // If the number is correct, the boolean variable will change to true.
            break;                      // "break" exits the loop before its end if the user gets the answer
            }                           // right, otherwise, it will repeat 2 more times.
        }

        if (guess) {                    // If user got a right answer, this message is displayed.
        System.out.println("Number guessed correctly");
        }
        else {                          // If user got 3 wrong answers, this message is displayed at the end.
        System.out.println("Number NOT guessed");
        }
        
        /* As per convention, every variable set with a constant (final), will be all typed in upper case letters. */
    
    }
    
}
    

