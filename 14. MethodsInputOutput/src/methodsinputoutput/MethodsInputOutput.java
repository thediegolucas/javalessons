package methodsinputoutput;

import java.util.Scanner;

/**
 * @author diegolucas
 */
public class MethodsInputOutput {   
    /* This time, where the word 'void; was, we now have the word 'double'.
    ** Different from the previous lesson, this method must send back or return a result.
    ** So the type of data that the method is to return in this case is a double. */
    
    /* Also note that the brackets () aren't empty. The variables declared in this way are known
    ** as the formal parameters of the method. Formal parameters are variables that are created
    ** exclusively to hold values sent in from the calling method. */
    
    /* The addTax method */
    
    static double addTax(double priceIn, double taxIn) {
        return priceIn * (1 + taxIn/100);
    }
    
    /* The main method */
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        
        System.out.println("*** Product Price Check ***");
        
        System.out.println("Enter initial price: ");
        price = keyboard.nextDouble();
        
        System.out.println("Enter tax rate: ");
        tax = keyboard.nextDouble();
        
        // Call the addTax method and store it in the variable "price".
        price = addTax(price, tax);     // Note that (price, tax) are in the same order as within the method (double priceIn, double taxIn).
        System.out.println("Cost after tax = " + price);
   
        
    /* It is possible to declare methods of any type — int, boolean, char and so on. */
        
    }
    
}
