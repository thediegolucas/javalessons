package whileloop;

import java.util.Scanner;                               // Imported Scanner from library.

/**
 * @author diegolucas
 */
public class WhileLoop {

    public static void main(String[] args) {
        /* A for loop is used for a fixed number of repetitions. When the repetition is not fixed, however,
        ** it is best to use another type of loop, the while loop. */
        
        int mark;                                       // Declare a variable with no value for mark.
        Scanner keyboard = new Scanner(System.in);      // Scanner to collect user input.
        System.out.println("What exam mark did you get?");
        mark = keyboard.nextInt();                      // Saves user input to variable "mark".
        
        while (mark < 0 || mark > 100) {        // The while loop with verify if mark entered is less than 0 OR greater than 100.
            System.out.println("Invalid mark. Please, enter your mark again.");       // If so, this message is displayed.
            mark = keyboard.nextInt();          // User will enter mark again. Programme will ask this until user enters a correct value.
        }
        
        if (mark >= 60) {                               // If the user scored 60 or more, they'll have passed.
            System.out.println("Congratulations, you passed!");
        }
        
        else {                                          // If the used scored less than 60, they'll have failed.
            System.out.println("I'm sorry, but you failed.");
        }
        
        /* This message will always be displayed at the end: */
        
        System.out.println("Good luck with the other exams.");
        
        /* The difference between this and lesson 5. IfElseStatement, is that if the user enters a number greater than 100
        or a negative number as a mark here, the programme will now ask for a valid input because of the while loop. */
    }
    
}
