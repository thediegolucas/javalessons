package variables;
/**
 * @author diegolucas
 */
public class Variables {

    public static void main(String[] args) {
        /* PRIMITIVE DATA TYPES
        ** To declare a variable, we use ** dataType variableName = value; **
        ** The variable name can be anything you like. */
        
        byte verySmall = 127;
        short small = 32767;
        int big = 2147483647 ;
        long veryBig = 9223372036854775807l;    // You have to add an "l" at the end of a long data type declaration.
        float real = 2.5f;                      // You have to add an "f" at the end of a float data type declaration.
        double veryBigReal = 25.9;
        char character = 'R';                   // You have to use 'single quotes' for characters.
        boolean trueOrFalse = true;             // Boolean only takes TRUE or FALSE values.
        
        /* We can declare more than one variable at once and assign a value to them later on: */
        int number1, number2, number3;          // First you declare it.
        // Add some code here
        number1 = 12;                           // Then you assign a value to it.
        
    }
    
}
