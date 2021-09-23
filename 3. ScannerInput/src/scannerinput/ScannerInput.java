package scannerinput;

import java.util.Scanner;                               // To use Scanner, you have to import it.

/**
 * @author diegolucas
 */
public class ScannerInput {

    public static void main(String[] args) {
        /* Scanner takes input from the user. */
        
        Scanner keyboard = new Scanner(System.in);      // Declare a new Scanner with a name you want (keyboard).
        
        int age;                                        // Declare variables without any value; They'll be assigned values by the user later on.
        double price;                                   // This can be done before or after the Scanner declaration.
        char letter;
        
        /* The programme will now ask questions and save the answers to the variables above */
        
        System.out.println("How old are you?");
        age = keyboard.nextInt();                       // This collects and saves a whole number to the variable age.
        
        System.out.println("How much did your computer cost?");
        price = keyboard.nextDouble();                  // This collects and saves a real number to the variable price.
        
        System.out.println("What's the first letter of your name?");
        letter = keyboard.next().charAt(0);             // This collects and saves a character to the variable letter.
        
        /* If you type a letter where it should be a number (int or double), a real number where it should be a whole number (int),
        ** the programme will crash. The variable for char takes letters, numbers or symbols, so it won't crash. */
        
        /* You can also declare the variables for Scanner like this: */
        
        System.out.println("How many pens have you got?");
        int pens = keyboard.nextInt();                  // Declare the variable and assign it to collect the user input on the same line.
        
        System.out.println("How high is the Great Pyramid in metres?");
        double height = keyboard.nextDouble();
        
        System.out.println("What's the first letter of the alphabet?");
        char firstLetter = keyboard.next().charAt(0);
    }
    
}
