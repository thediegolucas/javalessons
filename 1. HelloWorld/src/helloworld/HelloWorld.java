package helloworld;
/**
 * @author diegolucas
 */
public class HelloWorld {

    public static void main(String[] args) {
        /* This line of code is used to output text.
        ** Anything enclosed by "inverted commas" will be printed to the screen in a new line. */
        
        System.out.println("Hello World!");
        System.out.println("My name is Diego.");
        System.out.println("I'm a future programmer.");
        System.out.println();   // Leave it empty for a blank line.
        
        /* You can also type "\n" (with no spaces or quotation marks) before or after the message to make
        ** the message go to a new line, even though everything is being typed on one line. */
        
        System.out.println("Hello World!\nMy name is Diego\nI'm a future programmer.\n");   // The last \n adds an empty line.
        
        /* This line of code is also used to output text.
        ** But this one does not add a new line or spaces between. */
        
        System.out.print("Hello World!");
        System.out.print("My name is Diego.");
        System.out.print("I'm a future programmer.");
        
    }
    
}
