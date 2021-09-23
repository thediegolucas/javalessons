package continuestatement;
/**
 * @author diegolucas
 */
public class ContinueStatement {

    public static void main(String[] args) {
        /* While the "break" statement forces a loop to terminate, a "continue" statement forces a loop to skip
        ** the remaining instructions in the body of the loop and to continue into the next iteration. */
        
        // Consider this example:
        System.out.println("Even numbers from 10 to 0.");
        System.out.println();
        
        for(int i = 10; i >= 0; i--) {      // "For" loop will count down from 10 to 0.
            
            if (i % 2 == 0) {               // But it will only look for even numbers.
                System.out.println(i);
            }
        }
        
        /* To check for even numbers, we use the variable (i), the modulus operator (%) and the number 2 equals 0.
        ** That means that it will check which numbers leave a remainder of 0 when divided by 2. In this case, only the even numbers. */
        
        /* An alternative approach would have been to skip a number if it was odd and move on to the next iteration of the loop.
        ** If the number is not skipped then it must be even, so can be displayed: */
        
        System.out.println("Even numbers from 10 to 0.");
        System.out.println();
        
        for(int j = 10; j >= 0; j--) {      // "For" loop will count down from 10 to 0.
            
            if (j % 2 != 0) {               // Note that now, it will check if the number in not even (!=).
                continue;                   // If the number is odd, it will skip it to the next iteration.
            }
            System.out.println(j);
        }
         
    }
    
}
