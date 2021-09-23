package methods;

import java.util.Scanner;

/**
 * @author diegolucas
 */
public class Methods {   
    /* Created a method called "message". The brackets () are used to send information. They are empty now because
    ** we are only printing a message. The word 'void' indicates that the method does not return any information.
    ** Methods that have been declared as 'static' (such as main) can only call other methods in the class if they too are static. */
    
    static void message() {         // Note that the method MUST be out of the 'main method', but inside the 'public class'.
        System.out.println("Please note that all information supplied is confidential.");
        System.out.println("No personal details will be shared with any third party.");
    }
    
    /* The main method */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year, month, day;
        
        System.out.println("Enter your year of birth, please.");
        year = keyboard.nextInt();
        message();                  // Call the message method.
        
        System.out.println("Enter your month of birth, please. (1-12)");
        month = keyboard.nextInt();
        message();                  // Call the message method.
        
        System.out.println("Enter your day of birth, please.");
        day = keyboard.nextInt();
        message();                  // Call the message method.
        
        /* In this example, we asked the user for their year, month and day of birth within the 'main method'.
        ** Every time the user entered an input, a message was displayed. The ideia of having a method (message)
        ** is that, instead of typing the message 3 times, we only typed it once and called it when we needed it.
        ** You can place the method before or after the 'main method', because when the program is run, it always starts with main. */
    }
    
}
