package forloop;
/**
 * @author diegolucas
 */
public class ForLoop {

    public static void main(String[] args) {
        /* If we wish to repeat a section of code a fixed number of times, we use a for loop. */
        
        for (int i = 1; i <= 5; i++) {          // This is a counter that loops to repeat 5 times.
            System.out.println("* * * * *");    // This line will be displayed 5 times.
        }
        
        /* How does the counter work?
        ** We declare a variable, normally an integer (int), name it (i), then give it a value to start (1);
        ** The second bit of information in the header is a test. When the test returns a boolean value of true, the loop repeats;
        when it returns a boolean value of false – that is, when it is no longer less than or equal to 5 – the loop ends;
        ** Finally, the third bit of information (i++) changes the value of the counter so that eventually the loop
        test will be false. It means "Add 1" and what it does is increase the value of the variable i by 1 until it reaches 5. */
        
        System.out.println();                   // Just a line break.
        
        /* In this example, the counter starts at 2 and adds 2 each time to loop 5 times the same way as the first example. */
        
        for (int i = 2; i <= 10; i = i+2) {     // Here, the counter takes the first value of i (2) and adds 2 to it at the end.
            System.out.println("* * * * *");    // This line will still be displayed 5 times.
        }
        
        System.out.println();
        
        /* This examples shows a countdown (decrease) using a for loop. */
        
        System.out.println("Countdown");
        for (int j = 10; j >= 0; j--) {          // The counter starts at 10 and loop until j is equal to 0 (j--).
            System.out.println(j);
        }
        
        /* it is possible to nest "if", "if..else" statements, "switch" and even another loop in a "for loop". */

    }
    
}
