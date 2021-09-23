package dowhileloop;

import java.util.Scanner;                                   // Imported Scanner from library.

/**
 * @author diegolucas
 */
public class DoWhileLoop {

    public static void main(String[] args) {
        /* The "do...while" loop is another variable loop construct, but, unlike the while loop,
        ** it has its test at the end rather than at the beginning. */
        
        double price, tax;                                  // Declare variables with no values for price, tax and reply.
        char reply;
        Scanner keyboard = new Scanner(System.in);          // Scanner for user input.
        
        /* Initiate the "do...while" loop. */
        do {
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: ");
        price = keyboard.nextDouble();          // Saves user input to variable "price".
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble();            // Saves user input to variable "tax".
        price = price * (1 + tax/100);          // Updates the price with the tax and saves it again to the variable "price".
        System.out.println("Cost after tax = " + price);
        System.out.println();
        System.out.print("Would you like to enter another product? (y/n) ");
        reply = keyboard.next().charAt(0);      // Saves user input to variable "reply".
        System.out.println();
        }
        
        /* The "while" loop will check the "reply". It will accept both upper and lower case.
        ** If the reply is true (y), it repeats. Otherwise (n), the programme ends. */
        
        while (reply == 'y' || reply == 'Y');
    
        /* Note that the "while" part of the loop is not enclosed by { } and ends in a semi-colon ;.
        ** It is possible to nest "if", "if...else" and "switch" statements in the "do" part of the loop, and use
        ** the "while" part to test an option. */
        
    }
        
}
